package com.atguigu.jxc.service;

import com.atguigu.jxc.entity.SaleListGoods;

import java.util.List;
import java.util.Map;

public interface SaleListGoodsService {

    /**
     * 销售单商品信息
     * @param saleListId 销售id列表
     * t_sale_list_goods里面有sale_list_id字段
     * @return {@link Map}<{@link String} , {@link SaleListGoods}>
     */
    List<SaleListGoods> goodsList(Integer saleListId);

    void deleteBySaleListId(Integer saleListId);
}
