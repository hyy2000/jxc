package com.atguigu.jxc.dao;

public interface SaleListDao {

    void deleteBySaleListId(Integer saleListId);

    void updateState(Integer saleListId);
}
