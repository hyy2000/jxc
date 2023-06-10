package com.atguigu.jxc.controller;

import com.atguigu.jxc.entity.SaleListGoods;
import com.atguigu.jxc.service.SaleListGoodsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/saleListGoods")
public class SaleListGoodsController {

    @Autowired
    private SaleListGoodsService saleListGoodsService;

    @PostMapping("goodsList/{saleListId}")
    public Map<String , SaleListGoods>  saleListGood(@PathVariable("saleListId") Integer saleListId){
        SaleListGoods saleListGoods = saleListGoodsService.saleListGood(saleListId);
        HashMap<String, SaleListGoods> map = new HashMap<>();
        map.put("rows",saleListGoods);
        return map;
    }
}
