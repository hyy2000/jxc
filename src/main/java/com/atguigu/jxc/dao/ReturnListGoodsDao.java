package com.atguigu.jxc.dao;

import java.util.List;
import java.util.Map;

public interface ReturnListGoodsDao {
    List<Map<String, Object>> count(String sTime, String eTime, Integer goodsTypeId, String codeOrName);
}
