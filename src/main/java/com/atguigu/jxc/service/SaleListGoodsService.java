package com.atguigu.jxc.service;

import com.atguigu.jxc.entity.SaleListGoods;

import java.util.List;

public interface SaleListGoodsService {

    List<SaleListGoods> goodsList(Integer saleListId);
}
