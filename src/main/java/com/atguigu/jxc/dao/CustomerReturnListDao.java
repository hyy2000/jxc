package com.atguigu.jxc.dao;

import com.atguigu.jxc.dto.CustomerReturnListGoodsDTO;
import com.atguigu.jxc.entity.CustomerReturnList;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface CustomerReturnListDao {
    List<CustomerReturnList> getList(CustomerReturnListGoodsDTO customerReturnListGoodsDTO);

    void delete(Integer customerReturnListId);
}
