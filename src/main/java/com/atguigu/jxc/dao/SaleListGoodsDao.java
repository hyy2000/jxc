package com.atguigu.jxc.dao;

import com.atguigu.jxc.entity.SaleListGoods;

import java.util.List;
import java.util.Map;

public interface SaleListGoodsDao {

    List<SaleListGoods> goodsList(Integer saleListId);

    void deleteBySaleListId(Integer saleListId);

    List<Map<String, Object>> count(String sTime, String eTime, Integer goodsTypeId, String codeOrName);
}
