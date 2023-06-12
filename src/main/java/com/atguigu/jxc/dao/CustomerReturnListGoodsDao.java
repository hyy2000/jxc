package com.atguigu.jxc.dao;

import com.atguigu.jxc.entity.CustomerReturnListGoods;

import java.util.List;

public interface CustomerReturnListGoodsDao {
    List<CustomerReturnListGoods> goodsListInfo(Integer customerReturnListId);

    void delete(Integer customerReturnListId);
}
