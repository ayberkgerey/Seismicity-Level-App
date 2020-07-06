
package com.example.pgafinder.models;

import android.os.Parcel;
import android.os.Parcelable;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.io.Serializable;
import java.util.List;

public class Coordinator implements Serializable, Parcelable
{

    @SerializedName("displayFieldName")
    @Expose
    private String displayFieldName;
    @SerializedName("fieldAliases")
    @Expose
    private FieldAliases fieldAliases;
    @SerializedName("geometryType")
    @Expose
    private String geometryType;
    @SerializedName("spatialReference")
    @Expose
    private SpatialReference spatialReference;
    @SerializedName("fields")
    @Expose
    private List<Field> fields = null;
    @SerializedName("features")
    @Expose
    private List<Feature> features = null;
    public final static Creator<Coordinator> CREATOR = new Creator<Coordinator>() {


        @SuppressWarnings({
            "unchecked"
        })
        public Coordinator createFromParcel(Parcel in) {
            return new Coordinator(in);
        }

        public Coordinator[] newArray(int size) {
            return (new Coordinator[size]);
        }

    }
    ;
    private final static long serialVersionUID = -1008617193643125922L;

    protected Coordinator(Parcel in) {
        this.displayFieldName = ((String) in.readValue((String.class.getClassLoader())));
        this.fieldAliases = ((FieldAliases) in.readValue((FieldAliases.class.getClassLoader())));
        this.geometryType = ((String) in.readValue((String.class.getClassLoader())));
        this.spatialReference = ((SpatialReference) in.readValue((SpatialReference.class.getClassLoader())));
        in.readList(this.fields, (Field.class.getClassLoader()));
        in.readList(this.features, (Feature.class.getClassLoader()));
    }

    public Coordinator() {
    }

    public String getDisplayFieldName() {
        return displayFieldName;
    }

    public void setDisplayFieldName(String displayFieldName) {
        this.displayFieldName = displayFieldName;
    }

    public FieldAliases getFieldAliases() {
        return fieldAliases;
    }

    public void setFieldAliases(FieldAliases fieldAliases) {
        this.fieldAliases = fieldAliases;
    }

    public String getGeometryType() {
        return geometryType;
    }

    public void setGeometryType(String geometryType) {
        this.geometryType = geometryType;
    }

    public SpatialReference getSpatialReference() {
        return spatialReference;
    }

    public void setSpatialReference(SpatialReference spatialReference) {
        this.spatialReference = spatialReference;
    }

    public List<Field> getFields() {
        return fields;
    }

    public void setFields(List<Field> fields) {
        this.fields = fields;
    }

    public List<Feature> getFeatures() {
        return features;
    }

    public void setFeatures(List<Feature> features) {
        this.features = features;
    }

    public void writeToParcel(Parcel dest, int flags) {
        dest.writeValue(displayFieldName);
        dest.writeValue(fieldAliases);
        dest.writeValue(geometryType);
        dest.writeValue(spatialReference);
        dest.writeList(fields);
        dest.writeList(features);
    }

    public int describeContents() {
        return  0;
    }

}
