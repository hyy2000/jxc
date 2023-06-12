package com.atguigu.jxc.service;

import com.atguigu.jxc.dto.CustomerReturnListGoodsDTO;
import com.atguigu.jxc.entity.CustomerReturnList;
import com.atguigu.jxc.entity.CustomerReturnListGoods;

import java.util.List;

public interface CustomerReturnListGoodsService {
    List<CustomerReturnList> getList(CustomerReturnListGoodsDTO customerReturnListGoodsDTO);

    List<CustomerReturnListGoods> goodsListInfo(Integer customerReturnListId);

    void delete(Integer customerReturnListId);
}
