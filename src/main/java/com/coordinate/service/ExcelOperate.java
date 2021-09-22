package com.coordinate.service;

import com.alibaba.excel.EasyExcel;
import com.alibaba.excel.context.AnalysisContext;
import com.alibaba.excel.event.AnalysisEventListener;
import com.coordinate.model.ExcelPrama;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.*;
import java.nio.charset.StandardCharsets;
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
        list = EasyExcel.read(inputStream,ExcelPrama.class,new ExcelPramaListener()).sheet().doReadSync();
    }

    public static class ExcelPramaListener extends AnalysisEventListener {
        private List<Object> datas = new ArrayList<>();
        /**
         * 通过 AnalysisContext 对象还可以获取当前 sheet，当前行等数据
         */
        @Override
        public void invoke(Object data, AnalysisContext context) {
            datas.add(data);
            //根据业务自行处理，可以写入数据库等等
            System.out.println(data);
        }


        //所以的数据解析完了调用
        @Override
        public void doAfterAllAnalysed(AnalysisContext context) {
        }

    }

}
