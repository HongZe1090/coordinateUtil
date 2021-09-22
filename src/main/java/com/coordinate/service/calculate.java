package com.coordinate.service;

import com.coordinate.Util.coordtrans;
import org.osgeo.proj4j.ProjCoordinate;

public class calculate {
    coordtrans test = new coordtrans();
    ProjCoordinate projCoordinate = new ProjCoordinate(121.976469682, 41.4470288037);
        test.coordtrans().transform(projCoordinate, projCoordinate);
    Double dNorth = projCoordinate.y;
    Double dEast = projCoordinate.x;
        System.out.print(dNorth);
        System.out.print("/");
        System.out.print(dEast);

}
