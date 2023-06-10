package com.atguigu.jxc.controller;

import com.atguigu.jxc.entity.SaleListGoods;
import com.atguigu.jxc.service.SaleListGoodsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/saleListGoods")
public class SaleListGoodsController {

    @Autowired
    private SaleListGoodsService saleListGoodsService;

    /**
     * 销售单商品信息
     * @param saleListId 销售id列表
     * t_sale_list_goods里面有sale_list_id字段
     * @return {@link Map}<{@link String} , {@link SaleListGoods}>
     */
    @PostMapping("/goodsList")
    public Map<String , Object>  saleListGood(@RequestParam("saleListId") Integer saleListId){
        List<SaleListGoods> list = saleListGoodsService.goodsList(saleListId);
        HashMap<String, Object> map = new HashMap<>();
        map.put("rows",list);
        return map;
    }
}
