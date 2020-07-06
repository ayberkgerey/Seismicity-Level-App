
package com.example.pgafinder.models;

import android.os.Parcel;
import android.os.Parcelable;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

public class FieldAliases implements Serializable, Parcelable
{

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
    public final static Creator<FieldAliases> CREATOR = new Creator<FieldAliases>() {


        @SuppressWarnings({
            "unchecked"
        })
        public FieldAliases createFromParcel(Parcel in) {
            return new FieldAliases(in);
        }

        public FieldAliases[] newArray(int size) {
            return (new FieldAliases[size]);
        }

    }
    ;
    private final static long serialVersionUID = 1712952122509688317L;

    protected FieldAliases(Parcel in) {
        this.oID = ((String) in.readValue((String.class.getClassLoader())));
        this.name = ((String) in.readValue((String.class.getClassLoader())));
        this.folderPath = ((String) in.readValue((String.class.getClassLoader())));
        this.symbolID = ((String) in.readValue((String.class.getClassLoader())));
        this.altMode = ((String) in.readValue((String.class.getClassLoader())));
        this.base = ((String) in.readValue((String.class.getClassLoader())));
        this.clamped = ((String) in.readValue((String.class.getClassLoader())));
        this.extruded = ((String) in.readValue((String.class.getClassLoader())));
        this.snippet = ((String) in.readValue((String.class.getClassLoader())));
        this.popupInfo = ((String) in.readValue((String.class.getClassLoader())));
        this.shapeLength = ((String) in.readValue((String.class.getClassLoader())));
        this.shapeArea = ((String) in.readValue((String.class.getClassLoader())));
    }

    public FieldAliases() {
    }

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

    public void writeToParcel(Parcel dest, int flags) {
        dest.writeValue(oID);
        dest.writeValue(name);
        dest.writeValue(folderPath);
        dest.writeValue(symbolID);
        dest.writeValue(altMode);
        dest.writeValue(base);
        dest.writeValue(clamped);
        dest.writeValue(extruded);
        dest.writeValue(snippet);
        dest.writeValue(popupInfo);
        dest.writeValue(shapeLength);
        dest.writeValue(shapeArea);
    }

    public int describeContents() {
        return  0;
    }

}
