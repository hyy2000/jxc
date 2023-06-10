package com.atguigu.jxc.dao;

import com.atguigu.jxc.entity.Goods;
import com.atguigu.jxc.entity.SaleListGoods;

public interface SaleListGoodsDao {

    SaleListGoods goodInfo(Integer saleListId);
}
