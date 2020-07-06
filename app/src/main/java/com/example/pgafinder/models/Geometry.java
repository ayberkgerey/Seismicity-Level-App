package com.example.pgafinder.models;

import android.os.Parcel;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.io.Serializable;
import java.util.List;

public class Geometry implements Serializable
{

    @SerializedName("rings")
    @Expose
    private List<List<List<Float>>> rings = null;
    private final static long serialVersionUID = 5818956658546018588L;

    public Geometry() {
    }

    public List<List<List<Float>>> getRings() {
        return rings;
    }

    public void setRings(List<List<List<Float>>> rings) {
        this.rings = rings;
    }

    public void writeToParcel(Parcel dest, int flags) {
        dest.writeList(rings);
    }

    public int describeContents() {
        return  0;
    }

}
