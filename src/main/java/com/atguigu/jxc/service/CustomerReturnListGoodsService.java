package com.atguigu.jxc.service;

import com.atguigu.jxc.dto.CustomerReturnListGoodsDTO;
import com.atguigu.jxc.entity.CustomerReturnList;
import com.atguigu.jxc.entity.CustomerReturnListGoods;

import java.util.List;
import java.util.Map;

public interface CustomerReturnListGoodsService {
    List<CustomerReturnList> getList(CustomerReturnListGoodsDTO customerReturnListGoodsDTO);

    List<CustomerReturnListGoods> goodsListInfo(Integer customerReturnListId);

    void delete(Integer customerReturnListId);

    List<Map<String, Object>> count(String sTime, String eTime, Integer goodsTypeId, String codeOrName);
}
