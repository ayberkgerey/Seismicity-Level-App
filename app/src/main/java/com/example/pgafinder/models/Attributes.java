
package com.example.pgafinder.models;

import android.os.Parcel;
import android.os.Parcelable;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

public class Attributes implements Serializable, Parcelable
{

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
    public final static Creator<Attributes> CREATOR = new Creator<Attributes>() {


        @SuppressWarnings({
            "unchecked"
        })
        public Attributes createFromParcel(Parcel in) {
            return new Attributes(in);
        }

        public Attributes[] newArray(int size) {
            return (new Attributes[size]);
        }

    }
    ;
    private final static long serialVersionUID = 3545176859780147622L;

    protected Attributes(Parcel in) {
        this.oID = ((Integer) in.readValue((Integer.class.getClassLoader())));
        this.name = ((String) in.readValue((String.class.getClassLoader())));
        this.folderPath = ((String) in.readValue((String.class.getClassLoader())));
        this.symbolID = ((Integer) in.readValue((Integer.class.getClassLoader())));
        this.altMode = ((Integer) in.readValue((Integer.class.getClassLoader())));
        this.base = ((Integer) in.readValue((Integer.class.getClassLoader())));
        this.clamped = ((Integer) in.readValue((Integer.class.getClassLoader())));
        this.extruded = ((Integer) in.readValue((Integer.class.getClassLoader())));
        this.snippet = ((String) in.readValue((String.class.getClassLoader())));
        this.popupInfo = ((String) in.readValue((String.class.getClassLoader())));
        this.shapeLength = ((Float) in.readValue((Float.class.getClassLoader())));
        this.shapeArea = ((Float) in.readValue((Float.class.getClassLoader())));
    }

    public Attributes() {
    }

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
