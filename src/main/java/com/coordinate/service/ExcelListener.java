package com.coordinate.service;

import com.alibaba.excel.context.AnalysisContext;
import com.alibaba.excel.event.AnalysisEventListener;
import com.alibaba.excel.metadata.CellData;
import com.coordinate.model.ExcelPrama;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class ExcelListener extends AnalysisEventListener<ExcelPrama> {
    private List<ExcelPrama> datas = new ArrayList<>();
    @Override
    public void invoke(ExcelPrama data, AnalysisContext analysisContext) {
        System.out.println(analysisContext.getCurrentRowNum());
        datas.add(data);
        System.out.println(data.toString());
    }

    @Override
    public void doAfterAllAnalysed(AnalysisContext analysisContext) {

    }

    @Override
    public void invokeHead(Map<Integer, CellData> headMap, AnalysisContext context) {

    }
}
