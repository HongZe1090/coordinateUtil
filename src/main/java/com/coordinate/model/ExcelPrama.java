package com.coordinate.model;

import com.alibaba.excel.annotation.ExcelProperty;
import com.alibaba.excel.metadata.BaseRowModel;

import java.io.Serializable;

public class ExcelPrama {
    public class UserExcelModel  extends BaseRowModel implements Serializable {

        @ExcelProperty(value = "X", index = 0)
        private String X;

        @ExcelProperty(value = "Y", index = 1)
        private Integer Y;

        @ExcelProperty(value = "经度", index = 2)
        private String longitude;
        ;

        @ExcelProperty(value = "纬度", index = 3)
        private String latitude;;
    }
}
