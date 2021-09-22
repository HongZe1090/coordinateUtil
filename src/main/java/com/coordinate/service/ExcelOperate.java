package com.coordinate.service;

import com.alibaba.excel.EasyExcel;
import com.coordinate.model.ExcelPrama;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ExcelOperate {

    private static String Prama = "excelTemplete";
    private InputStream inputStream;

    public void Load(String fileName) throws IOException {
        String filePath = ExcelOperate.class.getResource("/" + Prama + "/" + fileName).getFile();
        File excel = new File(filePath);

        this.inputStream = new FileInputStream(excel);

        System.out.println(excel);
//        return workbook;
//        ClassPathResource classPathResource = new ClassPathResource("excelTemplate/easyexcel.xlsx");
//        InputStream inputStream = classPathResource.getInputStream();
//        Workbook workbook = new HSSFWorkbook(inputStream);
    }

    public void Read(){
        List<ExcelPrama> list = new ArrayList<>();
        list = EasyExcel.read(inputStream,ExcelPrama.class,new ExcelListener()).sheet().doReadSync();
    }


}
