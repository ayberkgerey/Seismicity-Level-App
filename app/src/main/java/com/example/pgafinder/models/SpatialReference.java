
package com.example.pgafinder.models;

import android.os.Parcel;
import android.os.Parcelable;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

public class SpatialReference implements Serializable, Parcelable
{

    @SerializedName("wkid")
    @Expose
    private Integer wkid;
    @SerializedName("latestWkid")
    @Expose
    private Integer latestWkid;
    @SerializedName("vcsWkid")
    @Expose
    private Integer vcsWkid;
    @SerializedName("latestVcsWkid")
    @Expose
    private Integer latestVcsWkid;
    public final static Creator<SpatialReference> CREATOR = new Creator<SpatialReference>() {


        @SuppressWarnings({
            "unchecked"
        })
        public SpatialReference createFromParcel(Parcel in) {
            return new SpatialReference(in);
        }

        public SpatialReference[] newArray(int size) {
            return (new SpatialReference[size]);
        }

    }
    ;
    private final static long serialVersionUID = 6058055368209272542L;

    protected SpatialReference(Parcel in) {
        this.wkid = ((Integer) in.readValue((Integer.class.getClassLoader())));
        this.latestWkid = ((Integer) in.readValue((Integer.class.getClassLoader())));
        this.vcsWkid = ((Integer) in.readValue((Integer.class.getClassLoader())));
        this.latestVcsWkid = ((Integer) in.readValue((Integer.class.getClassLoader())));
    }

    public SpatialReference() {
    }

    public Integer getWkid() {
        return wkid;
    }

    public void setWkid(Integer wkid) {
        this.wkid = wkid;
    }

    public Integer getLatestWkid() {
        return latestWkid;
    }

    public void setLatestWkid(Integer latestWkid) {
        this.latestWkid = latestWkid;
    }

    public Integer getVcsWkid() {
        return vcsWkid;
    }

    public void setVcsWkid(Integer vcsWkid) {
        this.vcsWkid = vcsWkid;
    }

    public Integer getLatestVcsWkid() {
        return latestVcsWkid;
    }

    public void setLatestVcsWkid(Integer latestVcsWkid) {
        this.latestVcsWkid = latestVcsWkid;
    }

    public void writeToParcel(Parcel dest, int flags) {
        dest.writeValue(wkid);
        dest.writeValue(latestWkid);
        dest.writeValue(vcsWkid);
        dest.writeValue(latestVcsWkid);
    }

    public int describeContents() {
        return  0;
    }

}
