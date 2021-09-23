package com.coordinate.model;

import com.alibaba.excel.annotation.ExcelProperty;
import com.alibaba.excel.metadata.BaseRowModel;

import java.io.Serializable;

public class writeExcelPrama extends BaseRowModel implements Serializable {
    @ExcelProperty(index = 0)
    private Double x;

    @ExcelProperty(index = 1)
    private Double y;

    @ExcelProperty(value = "经度" ,index = 2)
    private Double longitude;

    @ExcelProperty(value = "纬度" ,index = 3)
    private Double latitude;

    public Double getX() {
        return x;
    }

    public void setX(Double x) {
        this.x = x;
    }

    public Double getY() {
        return y;
    }

    public void setY(Double y) {
        this.y = y;
    }

    public Double getLongitude() {
        return longitude;
    }

    public void setLongitude(Double longitude) {
        this.longitude = longitude;
    }

    public Double getLatitude() {
        return latitude;
    }

    public void setLatitude(Double latitude) {
        this.latitude = latitude;
    }

    public writeExcelPrama() {
    }

    public writeExcelPrama(Double x, Double y, Double longitude, Double latitude) {
        this.x = x;
        this.y = y;
        this.longitude = longitude;
        this.latitude = latitude;
    }
}
