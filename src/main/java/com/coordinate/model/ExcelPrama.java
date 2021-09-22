package com.coordinate.model;

import com.alibaba.excel.annotation.ExcelProperty;
import com.alibaba.excel.metadata.BaseRowModel;

import java.io.Serializable;

public class ExcelPrama extends BaseRowModel implements Serializable{
        @ExcelProperty(index = 0)
        private Double x;

        @ExcelProperty(index = 1)
        private Double y;

        @ExcelProperty(index = 2)
        private String longitude;
        ;

        @ExcelProperty(index = 3)
        private String latitude;;

        @Override
        public String toString() {
            return "ExcelPrama{" +
                    "X=" + this.x +
                    ", Y=" + this.y +
                    ", longitude=" + longitude +
                    ", latitude=" + latitude +
                    '}';
        }

        public ExcelPrama(Double x, Double y, String longitude, String latitude) {
            this.x = x;
            this.y = y;
            this.longitude = longitude;
            this.latitude = latitude;
        }

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

        public String getLongitude() {
            return longitude;
        }

        public void setLongitude(String longitude) {
            this.longitude = longitude;
        }

        public String getLatitude() {
            return latitude;
        }

    public ExcelPrama() {
    }

    public void setLatitude(String latitude) {
            this.latitude = latitude;
        }
}
