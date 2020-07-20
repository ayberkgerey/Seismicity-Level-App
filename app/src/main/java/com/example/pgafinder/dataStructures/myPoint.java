package com.example.pgafinder.dataStructures;

import com.google.maps.android.geometry.Point;

public class myPoint extends Point {

    public final double SI;

    public myPoint(double x,double y,double si) {
        super(x, y);
        SI = si;
    }

}
