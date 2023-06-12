package com.atguigu.jxc.service.impl;

import com.atguigu.jxc.dao.SaleListDao;
import com.atguigu.jxc.dao.SaleListGoodsDao;
import com.atguigu.jxc.entity.Goods;
import com.atguigu.jxc.entity.ReturnListGoods;
import com.atguigu.jxc.entity.SaleListGoods;
import com.atguigu.jxc.service.SaleListGoodsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class SaleListGoodsServiceImpl implements SaleListGoodsService {

    @Autowired
    private SaleListGoodsDao saleListGoodsDao;

    @Autowired
    private SaleListDao saleListDao;

    @Override
    public List<Map<String, Object>> count(String sTime, String eTime, Integer goodsTypeId, String codeOrName) {
        return saleListGoodsDao.count(sTime,eTime,goodsTypeId,codeOrName);
    }

    @Override
    public void updateState(Integer saleListId) {
        saleListDao.updateState(saleListId);
    }

    /**
     * 要操作两张表 t_sale_list, t_sale_list_goods
     *
     * @param saleListId
     */
    @Override
    public void deleteBySaleListId(Integer saleListId) {
        saleListGoodsDao.deleteBySaleListId(saleListId);
        saleListDao.deleteBySaleListId(saleListId);
    }

    @Override
    public List<SaleListGoods> goodsList(Integer saleListId) {
        return saleListGoodsDao.goodsList(saleListId);
    }


}
