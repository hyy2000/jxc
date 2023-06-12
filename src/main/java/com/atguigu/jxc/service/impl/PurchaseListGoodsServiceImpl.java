package com.atguigu.jxc.service.impl;

import com.atguigu.jxc.dao.PurchaseListGoodsDao;
import com.atguigu.jxc.dto.PurchaseListGoodsDTO;
import com.atguigu.jxc.service.PurchaseListGoodsService;
import com.google.gson.JsonArray;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class PurchaseListGoodsServiceImpl implements PurchaseListGoodsService {

    @Autowired
    private PurchaseListGoodsDao purchaseListGoodsDao;

    @Override
    public List<Map<String,Object>> purchaseList(PurchaseListGoodsDTO purchaseListGoodsDTO) {
        List<Map<String,Object>> list = purchaseListGoodsDao.purchaseList(purchaseListGoodsDTO);
        return list;
    }

    @Override
    public void updateState(Integer purchaseListId) {
        purchaseListGoodsDao.updateState(purchaseListId);
    }
}
