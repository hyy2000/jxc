package com.atguigu.jxc.controller;

import com.atguigu.jxc.entity.SaleListGoods;
import com.atguigu.jxc.service.CustomerReturnListGoodsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/customerReturnListGoods")
public class CustomerReturnListGoodsController {

    @Autowired
    private CustomerReturnListGoodsService customerReturnListGoodsService;


    @PostMapping("/list")
    public Map<String, Object> saleListGood() {
        List<SaleListGoods> list = customerReturnListGoodsService.getList();

        //构建返回值
        HashMap<String, Object> map = new HashMap<>();
        map.put("rows", list);
        return map;
    }

}
