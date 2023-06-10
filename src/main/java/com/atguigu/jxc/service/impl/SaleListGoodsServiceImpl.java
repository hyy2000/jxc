package com.atguigu.jxc.service.impl;

import com.atguigu.jxc.dao.SaleListGoodsDao;
import com.atguigu.jxc.entity.Goods;
import com.atguigu.jxc.entity.ReturnListGoods;
import com.atguigu.jxc.entity.SaleListGoods;
import com.atguigu.jxc.service.SaleListGoodsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SaleListGoodsServiceImpl implements SaleListGoodsService {

    @Autowired
    private SaleListGoodsDao saleListGoodsDao;


    /**
     * 要操作两张表 t_sale_list, t_sale_list_goods
     * @param saleListId
     */
    @Override
    public void DeleteSaleListAndGoods(Integer saleListId) {
    }

    @Override
    public List<SaleListGoods> goodsList(Integer saleListId) {
        return saleListGoodsDao.goodsList(saleListId);
    }


}
