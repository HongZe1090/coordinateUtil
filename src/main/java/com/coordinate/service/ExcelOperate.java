package com.coordinate.service;

import com.alibaba.excel.EasyExcel;
import com.alibaba.excel.ExcelWriter;
import com.alibaba.excel.write.metadata.WriteSheet;
import com.coordinate.model.readExcelPrama;
import com.coordinate.model.writeExcelPrama;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ExcelOperate {

    private static String Prama = "excelTemplete";
    private String excelPath;
    private String outPath;
    private List<writeExcelPrama> writeData= new ArrayList<>();

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

    public void Write(){
//        EasyExcel.write(excelPath , writeExcelPrama.class).sheet("Sheet1").doWrite(writeData);
        System.out.println("success");

        ExcelWriter excelWriter = EasyExcel.write(excelPath, writeExcelPrama.class).build();
        WriteSheet writeSheet = EasyExcel.writerSheet("Sheet1").build();
        excelWriter.write(writeData, writeSheet);
        /// 千万别忘记finish 会帮忙关闭流
        excelWriter.finish();
    }


}
