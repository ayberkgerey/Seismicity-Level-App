
package com.example.pgafinder.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Attributes {

    @SerializedName("OID")
    @Expose
    private Integer oID;
    @SerializedName("Name")
    @Expose
    private String name;
    @SerializedName("FolderPath")
    @Expose
    private String folderPath;
    @SerializedName("SymbolID")
    @Expose
    private Integer symbolID;
    @SerializedName("AltMode")
    @Expose
    private Integer altMode;
    @SerializedName("Base")
    @Expose
    private Integer base;
    @SerializedName("Clamped")
    @Expose
    private Integer clamped;
    @SerializedName("Extruded")
    @Expose
    private Integer extruded;
    @SerializedName("Snippet")
    @Expose
    private String snippet;
    @SerializedName("PopupInfo")
    @Expose
    private String popupInfo;
    @SerializedName("Shape_Length")
    @Expose
    private Float shapeLength;
    @SerializedName("Shape_Area")
    @Expose
    private Float shapeArea;

    public Integer getOID() {
        return oID;
    }

    public void setOID(Integer oID) {
        this.oID = oID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFolderPath() {
        return folderPath;
    }

    public void setFolderPath(String folderPath) {
        this.folderPath = folderPath;
    }

    public Integer getSymbolID() {
        return symbolID;
    }

    public void setSymbolID(Integer symbolID) {
        this.symbolID = symbolID;
    }

    public Integer getAltMode() {
        return altMode;
    }

    public void setAltMode(Integer altMode) {
        this.altMode = altMode;
    }

    public Integer getBase() {
        return base;
    }

    public void setBase(Integer base) {
        this.base = base;
    }

    public Integer getClamped() {
        return clamped;
    }

    public void setClamped(Integer clamped) {
        this.clamped = clamped;
    }

    public Integer getExtruded() {
        return extruded;
    }

    public void setExtruded(Integer extruded) {
        this.extruded = extruded;
    }

    public String getSnippet() {
        return snippet;
    }

    public void setSnippet(String snippet) {
        this.snippet = snippet;
    }

    public String getPopupInfo() {
        return popupInfo;
    }

    public void setPopupInfo(String popupInfo) {
        this.popupInfo = popupInfo;
    }

    public Float getShapeLength() {
        return shapeLength;
    }

    public void setShapeLength(Float shapeLength) {
        this.shapeLength = shapeLength;
    }

    public Float getShapeArea() {
        return shapeArea;
    }

    public void setShapeArea(Float shapeArea) {
        this.shapeArea = shapeArea;
    }

}
