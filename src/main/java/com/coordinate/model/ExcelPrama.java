package com.coordinate.model;

import com.alibaba.excel.annotation.ExcelProperty;
import com.alibaba.excel.metadata.BaseRowModel;

import java.io.Serializable;

public class ExcelPrama {
    public class UserExcelModel  extends BaseRowModel implements Serializable {
        public UserExcelModel(double x, double y, double longitude, double latitude) {
            X = x;
            Y = y;
            this.longitude = longitude;
            this.latitude = latitude;
        }

        public double getX() {
            return X;
        }

        public void setX(double x) {
            X = x;
        }

        public double getY() {
            return Y;
        }

        public void setY(double y) {
            Y = y;
        }

        public double getLongitude() {
            return longitude;
        }

        public void setLongitude(double longitude) {
            this.longitude = longitude;
        }

        public double getLatitude() {
            return latitude;
        }

        public void setLatitude(double latitude) {
            this.latitude = latitude;
        }

        @ExcelProperty(value = "X", index = 0)
        private double X;

        @ExcelProperty(value = "Y", index = 1)
        private double Y;

        @ExcelProperty(value = "经度", index = 2)
        private double longitude;
        ;

        @ExcelProperty(value = "纬度", index = 3)
        private double latitude;;
    }
}
