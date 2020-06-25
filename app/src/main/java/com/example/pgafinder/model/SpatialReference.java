
package com.example.pgafinder.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class SpatialReference {

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

}
