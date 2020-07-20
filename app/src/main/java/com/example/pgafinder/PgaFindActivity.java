package com.example.pgafinder;

import android.Manifest;
import android.content.Context;
import android.content.pm.PackageManager;
import android.location.Location;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.FragmentActivity;

import com.example.pgafinder.dataStructures.myPoint;
import com.example.pgafinder.models.Attributes;
import com.example.pgafinder.models.Coordinator;
import com.example.pgafinder.models.Feature;
import com.google.android.gms.location.FusedLocationProviderClient;
import com.google.android.gms.location.LocationServices;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.MapView;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.common.reflect.TypeToken;
import com.google.gson.Gson;
import com.google.maps.android.quadtree.PointQuadTree;

import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Type;
import java.util.List;


public class PgaFindActivity extends FragmentActivity implements OnMapReadyCallback {

    private static final String TAG = "PgaFindActivity";

    private TextView textLocation;
    private MapView mMapView;
    private GoogleMap mMap;
    private Boolean mLocationPermissionsGranted = false;
    private FusedLocationProviderClient mFusedLocationProviderClient;

    private PointQuadTree pointQuadTree;

    private static final String FINE_LOCATION = Manifest.permission.ACCESS_FINE_LOCATION;
    private static final int LOCATION_PERMISSION_REQUEST_CODE = 1234;
    private static final float DEFAULT_ZOOM = 10f;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pga_find);


        textLocation = (TextView) findViewById(R.id.textLocation);
        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        getLocationPermission();
        readJson();
    }
    @Override
    public void onMapReady(GoogleMap googleMap) {
        Toast.makeText(this,"Map is Ready",Toast.LENGTH_SHORT).show();
        Log.d(TAG, "onMapReady: Ready");
        mMap = googleMap;
        mMap.setMapType(GoogleMap.MAP_TYPE_HYBRID);

        if(mLocationPermissionsGranted){
            getDeviceLocation();

            if(ActivityCompat.checkSelfPermission(this,Manifest.permission.ACCESS_FINE_LOCATION)
                    != PackageManager.PERMISSION_GRANTED && ActivityCompat.checkSelfPermission(this,
                    Manifest.permission.ACCESS_COARSE_LOCATION) != PackageManager.PERMISSION_GRANTED){
                return;
            }
            mMap.setMyLocationEnabled(true);
            mMap.getUiSettings().setMyLocationButtonEnabled(false);
        }

        mMap.setOnMapClickListener(new GoogleMap.OnMapClickListener() {
            @Override
            public void onMapClick(LatLng latLng) {
                //Creating marker
                MarkerOptions markerOptions = new MarkerOptions();
                //Set Marker Position
                markerOptions.position(latLng);
                //set Latitude And Longitude On Marker
                markerOptions.title(latLng.latitude+" : " + latLng.longitude);

                //Clear the Previously Click position
                mMap.clear();
                //Zoom The Marker
                mMap.animateCamera(CameraUpdateFactory.newLatLngZoom(latLng,10));
                //Add Marker On Map
                mMap.addMarker(markerOptions);
            }
        });

    }
    private void getDeviceLocation(){
        Log.d(TAG, "getDeviceLocation: getting the device's current location");

        mFusedLocationProviderClient = LocationServices.getFusedLocationProviderClient(this);
        try{

            if(mLocationPermissionsGranted){
                Task location = mFusedLocationProviderClient.getLastLocation();
                location.addOnCompleteListener(new OnCompleteListener() {
                    @Override
                    public void onComplete(@NonNull Task task) {
                        if(task.isSuccessful()){
                            Log.d(TAG, "onComplete: found location!");
                            Location currentLocation = (Location) task.getResult();

                            showLocation(new LatLng(currentLocation.getLatitude(),currentLocation.getLongitude()));

                        }else{
                            Log.d(TAG, "onComplete: current location is null");
                            Toast.makeText(PgaFindActivity.this,"unable to get current location", Toast.LENGTH_SHORT).show();
                        }
                    }
                });
            }

        }catch(SecurityException e){
            Log.e(TAG, "getDeviceLocation: Security Exception: "+ e.getMessage());
        }
    }
    private void showLocation(LatLng latlng){

        //textView editing
        textLocation.setText(latlng.latitude +" , "+ latlng.longitude);


    }
    private void initMap(){

        Log.d(TAG, "initMap: Initializing Map");
        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager().findFragmentById(R.id.Gmap);
        mapFragment.getMapAsync(this);
    }
    private void getLocationPermission(){
        Log.d(TAG, "getLocationPermission: getting location permissions");
        String[] permissions = {Manifest.permission.ACCESS_FINE_LOCATION, Manifest.permission.ACCESS_COARSE_LOCATION};

        if(ContextCompat.checkSelfPermission(this.getApplicationContext(),FINE_LOCATION) == PackageManager.PERMISSION_GRANTED){

                mLocationPermissionsGranted = true;
                initMap();
        }
        else{ ActivityCompat.requestPermissions(this,permissions,LOCATION_PERMISSION_REQUEST_CODE); }
    }
    @Override
    public void onRequestPermissionsResult(int requestCode, @NonNull String[] permissions, @NonNull int[] grantResults) {
        Log.d(TAG, "onRequestPermissionsResult: called");
        mLocationPermissionsGranted = false;

        switch (requestCode){
            case LOCATION_PERMISSION_REQUEST_CODE:{
                for(int i = 0 ; i < grantResults.length; i++) {
                    if (grantResults[i] != PackageManager.PERMISSION_GRANTED){
                        mLocationPermissionsGranted = false;
                        Log.d(TAG, "onRequestPermissionsResult: permission failed");
                        return;
                    }
                }
                Log.d(TAG, "onRequestPermissionsResult: permission granted");
                mLocationPermissionsGranted = true;
                //initialize the map
                initMap();
            }
        }
    }

    private String getJsonFromAssets(Context context, String fileName) {
        String jsonString;
        try {
            InputStream is = context.getAssets().open(fileName);

            int size = is.available();
            byte[] buffer = new byte[size];
            is.read(buffer);
            is.close();

            jsonString = new String(buffer, "UTF-8");
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }

        return jsonString;
    }

    private void readJson(){

        String jsonFileString = getJsonFromAssets(getApplicationContext(), "sources.json");
        Log.i("data", jsonFileString);

        Gson gson = new Gson();
        Type listUserType = new TypeToken<Coordinator>() { }.getType();

        Coordinator coordinateList = gson.fromJson(jsonFileString, listUserType);

        Log.i("data", jsonFileString);

        for (Feature f : coordinateList.getFeatures()){

            Attributes attributes = f.getAttributes();
            double symbolID = attributes.getSymbolID();

            for (List<List<Float>> ring :f.getGeometry().getRings()) {

                List<Float> coordinates = ring.get(0);
                myPoint point = new myPoint(coordinates.get(0),coordinates.get(1),symbolID);
                pointQuadTree.add((PointQuadTree.Item) point);

            }


        }

    }

}
