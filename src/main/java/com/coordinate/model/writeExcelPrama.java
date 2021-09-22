package com.coordinate.model;

import com.alibaba.excel.annotation.ExcelProperty;
import com.alibaba.excel.metadata.BaseRowModel;

import java.io.Serializable;

public class writeExcelPrama extends BaseRowModel implements Serializable {
    @ExcelProperty(value = "经度" ,index = 2)
    private Double longitude;

    @ExcelProperty(value = "纬度" ,index = 3)
    private Double latitude;

    public writeExcelPrama(Double longitude, Double latitude) {
        this.longitude = longitude;
        this.latitude = latitude;
    }

    public writeExcelPrama() {
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
}
