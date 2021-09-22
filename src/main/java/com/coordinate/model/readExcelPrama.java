package com.coordinate.model;

import com.alibaba.excel.annotation.ExcelProperty;
import com.alibaba.excel.metadata.BaseRowModel;

import java.io.Serializable;

public class readExcelPrama extends BaseRowModel implements Serializable{
        @ExcelProperty(index = 0)
        private Double x;

        @ExcelProperty(index = 1)
        private Double y;


        @Override
        public String toString() {
            return "ExcelPrama{" +
                    "X=" + this.x +
                    ", Y=" + this.y +
                    '}';
        }

        public readExcelPrama(Double x, Double y, String longitude, String latitude) {
            this.x = x;
            this.y = y;
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


    public readExcelPrama() {
    }
}
