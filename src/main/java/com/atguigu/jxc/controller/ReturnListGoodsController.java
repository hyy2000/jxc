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

    /**
     * 退货统计（可根据 商品类别、商品编码或名称 条件查询）
     * @param sTime       年代时间
     * @param eTime       e时间
     * @param goodsTypeId 商品id类型
     * @param codeOrName  代码或名称
     * @return {@link List}<{@link Map}<{@link String},{@link Object}>>
     */
    //TODO 条件查询
    @PostMapping("/count")
    public List<Map<String,Object>> count(String sTime, String eTime ,Integer goodsTypeId, String codeOrName){
        return returnListGoodsService.count(sTime,eTime,goodsTypeId,codeOrName);
    }
}
