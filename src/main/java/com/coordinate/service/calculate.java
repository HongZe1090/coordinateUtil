package com.coordinate.service;

import com.coordinate.Util.coordtrans;
import com.coordinate.model.coordinate;
import org.osgeo.proj4j.ProjCoordinate;

public class calculate {

    public static coordinate compute(Double x, Double y) {
        coordtrans test = new coordtrans();
//        一般情况下y在前，x在后
        ProjCoordinate projCoordinate = new ProjCoordinate(y, x);
        test.coordtrans().transform(projCoordinate, projCoordinate);

        Double dNorth = projCoordinate.y;
        Double dEast = projCoordinate.x;
        System.out.print(dNorth);
        System.out.print("/");
        System.out.print(dEast);

        coordinate coord = new coordinate(projCoordinate.x,projCoordinate.y);
        return coord;
    }
}
