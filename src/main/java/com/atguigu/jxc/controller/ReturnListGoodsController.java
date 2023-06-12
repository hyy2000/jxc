package com.atguigu.jxc.controller;

import com.atguigu.jxc.service.ReturnListGoodsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping(value = "/returnListGoods")
public class ReturnListGoodsController {

    @Autowired
    private ReturnListGoodsService returnListGoodsService;

    @PostMapping("/list")
    public Map<String,Object> ListGoods(){
        return null;
    }

    @PostMapping("/count")
    public List<Map<String,Object>> count(String sTime, String eTime ,Integer goodsTypeId, String codeOrName){
        List<Map<String,Object>> list = returnListGoodsService.count(sTime,eTime,goodsTypeId,codeOrName);
        return list;
    }
}
