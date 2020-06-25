
package com.example.pgafinder.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class FieldAliases {

    @SerializedName("OID")
    @Expose
    private String oID;
    @SerializedName("Name")
    @Expose
    private String name;
    @SerializedName("FolderPath")
    @Expose
    private String folderPath;
    @SerializedName("SymbolID")
    @Expose
    private String symbolID;
    @SerializedName("AltMode")
    @Expose
    private String altMode;
    @SerializedName("Base")
    @Expose
    private String base;
    @SerializedName("Clamped")
    @Expose
    private String clamped;
    @SerializedName("Extruded")
    @Expose
    private String extruded;
    @SerializedName("Snippet")
    @Expose
    private String snippet;
    @SerializedName("PopupInfo")
    @Expose
    private String popupInfo;
    @SerializedName("Shape_Length")
    @Expose
    private String shapeLength;
    @SerializedName("Shape_Area")
    @Expose
    private String shapeArea;

    public String getOID() {
        return oID;
    }

    public void setOID(String oID) {
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

    public String getSymbolID() {
        return symbolID;
    }

    public void setSymbolID(String symbolID) {
        this.symbolID = symbolID;
    }

    public String getAltMode() {
        return altMode;
    }

    public void setAltMode(String altMode) {
        this.altMode = altMode;
    }

    public String getBase() {
        return base;
    }

    public void setBase(String base) {
        this.base = base;
    }

    public String getClamped() {
        return clamped;
    }

    public void setClamped(String clamped) {
        this.clamped = clamped;
    }

    public String getExtruded() {
        return extruded;
    }

    public void setExtruded(String extruded) {
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

    public String getShapeLength() {
        return shapeLength;
    }

    public void setShapeLength(String shapeLength) {
        this.shapeLength = shapeLength;
    }

    public String getShapeArea() {
        return shapeArea;
    }

    public void setShapeArea(String shapeArea) {
        this.shapeArea = shapeArea;
    }

}
