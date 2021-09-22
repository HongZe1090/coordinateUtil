package com.coordinate.service;

import com.alibaba.excel.EasyExcel;
import com.alibaba.excel.ExcelWriter;
import com.alibaba.excel.write.metadata.WriteSheet;
import com.coordinate.model.coordinate;
import com.coordinate.model.readExcelPrama;
import com.coordinate.model.writeExcelPrama;

import java.io.*;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ExcelOperate {

    private static String Prama = "excelTemplete";
    private List<readExcelPrama> list = new ArrayList<>();
    private String excelPath;
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
        this.list = EasyExcel.read(excelPath , readExcelPrama.class,new ExcelListener()).sheet("Sheet1").doReadSync();
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

    public void handler() {
        for(readExcelPrama value:list){
            coordinate coor = new calculate().compute(value.getX(),value.getY());
            writeExcelPrama write = new writeExcelPrama();
            write.setLongitude(coor.getArgX());
            write.setLatitude(coor.getArgY());
            writeData.add(write);
        }
    }


}
