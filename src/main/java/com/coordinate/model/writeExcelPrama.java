package com.coordinate.model;

import com.alibaba.excel.annotation.ExcelProperty;
import com.alibaba.excel.metadata.BaseRowModel;

import java.io.Serializable;

public class writeExcelPrama extends BaseRowModel implements Serializable {
    @ExcelProperty(index = 2)
    private Double longitude;

    @ExcelProperty(index = 3)
    private Double latitude;;

}
