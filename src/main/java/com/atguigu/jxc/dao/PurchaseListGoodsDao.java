package com.atguigu.jxc.dao;

import com.atguigu.jxc.dto.PurchaseListGoodsDTO;

import java.util.List;
import java.util.Map;

public interface PurchaseListGoodsDao {
    void updateState(Integer purchaseListId);

    List<Map<String,Object>> purchaseList(PurchaseListGoodsDTO purchaseListGoodsDTO);
}
