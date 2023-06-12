package com.atguigu.jxc.dao;

import com.atguigu.jxc.entity.CustomerReturnListGoods;

import java.util.List;
import java.util.Map;

public interface CustomerReturnListGoodsDao {
    List<CustomerReturnListGoods> goodsListInfo(Integer customerReturnListId);

    void delete(Integer customerReturnListId);

    List<Map<String, Object>> count(String sTime, String eTime, Integer goodsTypeId, String codeOrName);
}
