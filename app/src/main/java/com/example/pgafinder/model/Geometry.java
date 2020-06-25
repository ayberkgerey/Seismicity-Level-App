
package com.example.pgafinder.model;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Geometry {

    @SerializedName("rings")
    @Expose
    private List<List<List<Float>>> rings = null;

    public List<List<List<Float>>> getRings() {
        return rings;
    }

    public void setRings(List<List<List<Float>>> rings) {
        this.rings = rings;
    }

}
