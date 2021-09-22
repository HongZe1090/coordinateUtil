package com.coordinate.service;

import com.alibaba.excel.context.AnalysisContext;
import com.alibaba.excel.event.AnalysisEventListener;
import com.alibaba.excel.metadata.CellData;
import com.coordinate.model.readExcelPrama;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class ExcelListener extends AnalysisEventListener<readExcelPrama> {
    private List<readExcelPrama> datas = new ArrayList<>();
    @Override
    public void invoke(readExcelPrama data, AnalysisContext analysisContext) {
        datas.add(data);
    }

    @Override
    public void doAfterAllAnalysed(AnalysisContext analysisContext) {

    }

    @Override
    public void invokeHead(Map<Integer, CellData> headMap, AnalysisContext context) {

    }
}
