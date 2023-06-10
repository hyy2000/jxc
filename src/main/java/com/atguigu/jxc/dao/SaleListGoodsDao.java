package com.atguigu.jxc.dao;

import com.atguigu.jxc.entity.SaleListGoods;

import java.util.List;

public interface SaleListGoodsDao {

    List<SaleListGoods> goodsList(Integer saleListId);

    void deleteBySaleListId(Integer saleListId);
}
