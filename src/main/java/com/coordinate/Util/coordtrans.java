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
//        String xian80_param = "+proj=longlat +a=6378140 +b=6356755.288157528 +towgs84=94.462,70.149,-1.511,-0.423814,-0.091708,0.133866,-1.732 +no_de
//        偏移量也要加上带号
//        参数说明：投影坐标系-》墨脱
//                椭球体-》IAU76
//                偏移量-》未加代号
//                单位-》米
        String xian80_param = "+proj=tmerc +ellps=IAU76 +lat_0=0 +lon_0=117e +x_0=500000 +y_0=0 +units=m +k=1.0 +towgs84=94.462,70.149,-1.511,-0.423814,-0.091708,0.133866,-1.732 +no_defs";

        CoordinateReferenceSystem xian80 = crsFactory.createFromParameters("xian80", xian80_param);

        CoordinateTransformFactory ctf = new CoordinateTransformFactory();
        CoordinateTransform transform = ctf.createTransform(xian80, target);
        return transform;
    }

}
