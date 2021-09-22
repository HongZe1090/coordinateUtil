package com.coordinate.service;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.*;
import java.nio.charset.StandardCharsets;

public class ExcelOperate {

    private static String Prama = "excelTemplete";
//    excel输入流
    private Workbook workbook;

    public void Load(String fileName) throws IOException {
        String filePath = ExcelOperate.class.getResource("/" + Prama + "/" + fileName).getFile();
        File excel = new File(filePath);

        InputStream inputStream = new FileInputStream(excel);
        this.workbook = new XSSFWorkbook(inputStream);

        System.out.println(excel);
//        return workbook;
//        ClassPathResource classPathResource = new ClassPathResource("excelTemplate/easyexcel.xlsx");
//        InputStream inputStream = classPathResource.getInputStream();
//        Workbook workbook = new HSSFWorkbook(inputStream);
    }

    public void Read(){

    }

}
