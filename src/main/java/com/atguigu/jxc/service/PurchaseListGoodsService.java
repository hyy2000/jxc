package com.atguigu.jxc.service;

import com.atguigu.jxc.dto.PurchaseListGoodsDTO;

import java.util.List;
import java.util.Map;

public interface PurchaseListGoodsService {

    void updateState(Integer purchaseListId);

    List<Map<String,Object>> purchaseList(PurchaseListGoodsDTO purchaseListGoodsDTO);
}
