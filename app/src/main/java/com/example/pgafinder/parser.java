package com.example.pgafinder;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public abstract class parser {

    @Expose
    @SerializedName("features")
    private List<Features> features;
    @Expose
    @SerializedName("fields")
    private List<Fields> fields;
    @Expose
    @SerializedName("spatialReference")
    private SpatialReference spatialReference;
    @Expose
    @SerializedName("geometryType")
    private String geometryType;
    @Expose
    @SerializedName("fieldAliases")
    private FieldAliases fieldAliases;
    @Expose
    @SerializedName("displayFieldName")
    private String displayFieldName;

    public List<Features> getFeatures() {
        return features;
    }

    public void setFeatures(List<Features> features) {
        this.features = features;
    }

    public List<Fields> getFields() {
        return fields;
    }

    public void setFields(List<Fields> fields) {
        this.fields = fields;
    }

    public SpatialReference getSpatialReference() {
        return spatialReference;
    }

    public void setSpatialReference(SpatialReference spatialReference) {
        this.spatialReference = spatialReference;
    }

    public String getGeometryType() {
        return geometryType;
    }

    public void setGeometryType(String geometryType) {
        this.geometryType = geometryType;
    }

    public FieldAliases getFieldAliases() {
        return fieldAliases;
    }

    public void setFieldAliases(FieldAliases fieldAliases) {
        this.fieldAliases = fieldAliases;
    }

    public String getDisplayFieldName() {
        return displayFieldName;
    }

    public void setDisplayFieldName(String displayFieldName) {
        this.displayFieldName = displayFieldName;
    }

    public static class Features {
        @Expose
        @SerializedName("geometry")
        private Geometry geometry;
        @Expose
        @SerializedName("attributes")
        private Attributes attributes;

        public Geometry getGeometry() {
            return geometry;
        }

        public void setGeometry(Geometry geometry) {
            this.geometry = geometry;
        }

        public Attributes getAttributes() {
            return attributes;
        }

        public void setAttributes(Attributes attributes) {
            this.attributes = attributes;
        }
    }

    public static class Geometry {
        @Expose
        @SerializedName("rings")
        private List<List<List<Double>>> rings;

        public List<List<List<Double>>> getRings() {
            return rings;
        }

        public void setRings(List<List<List<Double>>> rings) {
            this.rings = rings;
        }
    }

    public static class Attributes {
        @Expose
        @SerializedName("Shape_Area")
        private double Shape_Area;
        @Expose
        @SerializedName("Shape_Length")
        private double Shape_Length;
        @Expose
        @SerializedName("PopupInfo")
        private String PopupInfo;
        @Expose
        @SerializedName("Snippet")
        private String Snippet;
        @Expose
        @SerializedName("Extruded")
        private int Extruded;
        @Expose
        @SerializedName("Clamped")
        private int Clamped;
        @Expose
        @SerializedName("Base")
        private int Base;
        @Expose
        @SerializedName("AltMode")
        private int AltMode;
        @Expose
        @SerializedName("SymbolID")
        private int SymbolID;
        @Expose
        @SerializedName("FolderPath")
        private String FolderPath;
        @Expose
        @SerializedName("Name")
        private String Name;
        @Expose
        @SerializedName("OID")
        private int OID;

        public double getShape_Area() {
            return Shape_Area;
        }

        public void setShape_Area(double Shape_Area) {
            this.Shape_Area = Shape_Area;
        }

        public double getShape_Length() {
            return Shape_Length;
        }

        public void setShape_Length(double Shape_Length) {
            this.Shape_Length = Shape_Length;
        }

        public String getPopupInfo() {
            return PopupInfo;
        }

        public void setPopupInfo(String PopupInfo) {
            this.PopupInfo = PopupInfo;
        }

        public String getSnippet() {
            return Snippet;
        }

        public void setSnippet(String Snippet) {
            this.Snippet = Snippet;
        }

        public int getExtruded() {
            return Extruded;
        }

        public void setExtruded(int Extruded) {
            this.Extruded = Extruded;
        }

        public int getClamped() {
            return Clamped;
        }

        public void setClamped(int Clamped) {
            this.Clamped = Clamped;
        }

        public int getBase() {
            return Base;
        }

        public void setBase(int Base) {
            this.Base = Base;
        }

        public int getAltMode() {
            return AltMode;
        }

        public void setAltMode(int AltMode) {
            this.AltMode = AltMode;
        }

        public int getSymbolID() {
            return SymbolID;
        }

        public void setSymbolID(int SymbolID) {
            this.SymbolID = SymbolID;
        }

        public String getFolderPath() {
            return FolderPath;
        }

        public void setFolderPath(String FolderPath) {
            this.FolderPath = FolderPath;
        }

        public String getName() {
            return Name;
        }

        public void setName(String Name) {
            this.Name = Name;
        }

        public int getOID() {
            return OID;
        }

        public void setOID(int OID) {
            this.OID = OID;
        }
    }

    public static class Fields {
        @Expose
        @SerializedName("length")
        private int length;
        @Expose
        @SerializedName("alias")
        private String alias;
        @Expose
        @SerializedName("type")
        private String type;
        @Expose
        @SerializedName("name")
        private String name;

        public int getLength() {
            return length;
        }

        public void setLength(int length) {
            this.length = length;
        }

        public String getAlias() {
            return alias;
        }

        public void setAlias(String alias) {
            this.alias = alias;
        }

        public String getType() {
            return type;
        }

        public void setType(String type) {
            this.type = type;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
    }

    public static class SpatialReference {
        @Expose
        @SerializedName("latestVcsWkid")
        private int latestVcsWkid;
        @Expose
        @SerializedName("vcsWkid")
        private int vcsWkid;
        @Expose
        @SerializedName("latestWkid")
        private int latestWkid;
        @Expose
        @SerializedName("wkid")
        private int wkid;

        public int getLatestVcsWkid() {
            return latestVcsWkid;
        }

        public void setLatestVcsWkid(int latestVcsWkid) {
            this.latestVcsWkid = latestVcsWkid;
        }

        public int getVcsWkid() {
            return vcsWkid;
        }

        public void setVcsWkid(int vcsWkid) {
            this.vcsWkid = vcsWkid;
        }

        public int getLatestWkid() {
            return latestWkid;
        }

        public void setLatestWkid(int latestWkid) {
            this.latestWkid = latestWkid;
        }

        public int getWkid() {
            return wkid;
        }

        public void setWkid(int wkid) {
            this.wkid = wkid;
        }
    }

    public static class FieldAliases {
        @Expose
        @SerializedName("Shape_Area")
        private String Shape_Area;
        @Expose
        @SerializedName("Shape_Length")
        private String Shape_Length;
        @Expose
        @SerializedName("PopupInfo")
        private String PopupInfo;
        @Expose
        @SerializedName("Snippet")
        private String Snippet;
        @Expose
        @SerializedName("Extruded")
        private String Extruded;
        @Expose
        @SerializedName("Clamped")
        private String Clamped;
        @Expose
        @SerializedName("Base")
        private String Base;
        @Expose
        @SerializedName("AltMode")
        private String AltMode;
        @Expose
        @SerializedName("SymbolID")
        private String SymbolID;
        @Expose
        @SerializedName("FolderPath")
        private String FolderPath;
        @Expose
        @SerializedName("Name")
        private String Name;
        @Expose
        @SerializedName("OID")
        private String OID;

        public String getShape_Area() {
            return Shape_Area;
        }

        public void setShape_Area(String Shape_Area) {
            this.Shape_Area = Shape_Area;
        }

        public String getShape_Length() {
            return Shape_Length;
        }

        public void setShape_Length(String Shape_Length) {
            this.Shape_Length = Shape_Length;
        }

        public String getPopupInfo() {
            return PopupInfo;
        }

        public void setPopupInfo(String PopupInfo) {
            this.PopupInfo = PopupInfo;
        }

        public String getSnippet() {
            return Snippet;
        }

        public void setSnippet(String Snippet) {
            this.Snippet = Snippet;
        }

        public String getExtruded() {
            return Extruded;
        }

        public void setExtruded(String Extruded) {
            this.Extruded = Extruded;
        }

        public String getClamped() {
            return Clamped;
        }

        public void setClamped(String Clamped) {
            this.Clamped = Clamped;
        }

        public String getBase() {
            return Base;
        }

        public void setBase(String Base) {
            this.Base = Base;
        }

        public String getAltMode() {
            return AltMode;
        }

        public void setAltMode(String AltMode) {
            this.AltMode = AltMode;
        }

        public String getSymbolID() {
            return SymbolID;
        }

        public void setSymbolID(String SymbolID) {
            this.SymbolID = SymbolID;
        }

        public String getFolderPath() {
            return FolderPath;
        }

        public void setFolderPath(String FolderPath) {
            this.FolderPath = FolderPath;
        }

        public String getName() {
            return Name;
        }

        public void setName(String Name) {
            this.Name = Name;
        }

        public String getOID() {
            return OID;
        }

        public void setOID(String OID) {
            this.OID = OID;
        }
    }
}