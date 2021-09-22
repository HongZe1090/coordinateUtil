package com.coordinate.service;

import com.alibaba.excel.EasyExcel;
import com.coordinate.model.readExcelPrama;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ExcelOperate {

    private static String Prama = "excelTemplete";
    private String excelPath;

    public void Load(String fileName) throws IOException {
        this.excelPath = ExcelOperate.class.getResource("/" + Prama + "/" + fileName).getFile();
//        this.excelPath = new File(filePath);

//        System.out.println(excel);
//        return workbook;
//        ClassPathResource classPathResource = new ClassPathResource("excelTemplate/easyexcel.xlsx");
//        InputStream inputStream = classPathResource.getInputStream();
//        Workbook workbook = new HSSFWorkbook(inputStream);
    }

    public void Read(){
        List<readExcelPrama> list = new ArrayList<>();
        list = EasyExcel.read(excelPath , readExcelPrama.class,new ExcelListener()).sheet("Sheet1").doReadSync();
    }


}
