
package com.example.pgafinder.models;

import android.os.Parcel;
import android.os.Parcelable;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

public class Feature implements Serializable, Parcelable
{

    @SerializedName("attributes")
    @Expose
    private Attributes attributes;
    @SerializedName("geometry")
    @Expose
    private Geometry geometry;
    public final static Creator<Feature> CREATOR = new Creator<Feature>() {


        @SuppressWarnings({
            "unchecked"
        })
        public Feature createFromParcel(Parcel in) {
            return new Feature(in);
        }

        public Feature[] newArray(int size) {
            return (new Feature[size]);
        }

    }
    ;
    private final static long serialVersionUID = 5524451919689036511L;

    protected Feature(Parcel in) {
        this.attributes = ((Attributes) in.readValue((Attributes.class.getClassLoader())));
        this.geometry = ((Geometry) in.readValue((Geometry.class.getClassLoader())));
    }

    public Feature() {
    }

    public Attributes getAttributes() {
        return attributes;
    }

    public void setAttributes(Attributes attributes) {
        this.attributes = attributes;
    }

    public Geometry getGeometry() {
        return geometry;
    }

    public void setGeometry(Geometry geometry) {
        this.geometry = geometry;
    }

    public void writeToParcel(Parcel dest, int flags) {
        dest.writeValue(attributes);
        dest.writeValue(geometry);
    }

    public int describeContents() {
        return  0;
    }

}
