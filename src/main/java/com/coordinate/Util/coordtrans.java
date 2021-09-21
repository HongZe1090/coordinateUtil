package com.coordinate.Util;

import org.osgeo.proj4j.CRSFactory;
import org.osgeo.proj4j.CoordinateReferenceSystem;
import org.osgeo.proj4j.CoordinateTransform;
import org.osgeo.proj4j.CoordinateTransformFactory;

public class coordtrans {
    public CoordinateTransform coordtrans() {
        CRSFactory targetFactory = new CRSFactory();
        CRSFactory crsFactory = new CRSFactory();
        //目标坐标系统
        String target_param =  "+proj=longlat +datum=WGS84 +no_defs ";
        CoordinateReferenceSystem target = targetFactory.createFromParameters("wgs84", target_param);
        //源坐标系统
        String xian80_param = "+proj=longlat +a=6378140 +b=6356755.288157528 +towgs84=115.8,-154.4,-82.3,0,0,0,8 +no_defs ";
        CoordinateReferenceSystem xian80 = crsFactory.createFromParameters("xian80", xian80_param);

        CoordinateTransformFactory ctf = new CoordinateTransformFactory();
        CoordinateTransform transform = ctf.createTransform(xian80, target);
        return transform;
    }

}
