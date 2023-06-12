package com.atguigu.jxc.service;

import java.util.List;
import java.util.Map;

public interface ReturnListGoodsService {
    List<Map<String, Object>> count(String sTime, String eTime, Integer goodsTypeId, String codeOrName);
}
