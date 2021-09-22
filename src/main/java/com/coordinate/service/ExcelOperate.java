package com.coordinate.service;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Workbook;

import java.io.*;
import java.nio.charset.StandardCharsets;

public class ExcelOperate {

    private static String Prama = "excelTemplete";

    public void Load(String fileName) throws IOException {
        String filePath = ExcelOperate.class.getResource("/" + Prama + "/" + fileName).getFile();
        File excel = new File(filePath);
        OutputStream inputStream = new FileOutputStream(excel);


        System.out.println(excel);
//        return workbook;
//        ClassPathResource classPathResource = new ClassPathResource("excelTemplate/easyexcel.xlsx");
//        InputStream inputStream = classPathResource.getInputStream();
//        Workbook workbook = new HSSFWorkbook(inputStream);
    }

}
