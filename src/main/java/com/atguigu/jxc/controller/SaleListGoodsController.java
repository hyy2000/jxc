package com.atguigu.jxc.controller;

import com.atguigu.jxc.entity.SaleListGoods;
import com.atguigu.jxc.service.SaleListGoodsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/saleListGoods")
public class SaleListGoodsController {

    @Autowired
    private SaleListGoodsService saleListGoodsService;

    /**
     * 销售单商品信息
     * @param saleListId 出售id列表
     * @return {@link Map}<{@link String} , {@link SaleListGoods}>
     */
    @PostMapping("/goodsList")
    public Map<String , SaleListGoods>  saleListGood(@RequestParam("saleListId") Integer saleListId){
        SaleListGoods saleListGoods = saleListGoodsService.saleListGood(saleListId);
        HashMap<String, SaleListGoods> map = new HashMap<>();
        map.put("rows",saleListGoods);
        return map;
    }
}
