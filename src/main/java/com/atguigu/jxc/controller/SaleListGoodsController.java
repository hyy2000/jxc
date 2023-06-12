package com.atguigu.jxc.controller;

import com.atguigu.jxc.domain.ServiceVO;
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


    /**
     * 删除销售单 ,   涉及两张表, t_sale_list, t_sale_list_goods
     *
     * @param saleListId 出售id列表
     * @return {@link ServiceVO}
     */
    @PostMapping("/delete")
    public ServiceVO DeleteSaleListAndGoods(@RequestParam("saleListId") Integer saleListId){
        saleListGoodsService.deleteBySaleListId(saleListId);
        return ServiceVO.success(null);

    }

    /**
     * 支付结算（修改销售单付款状态）
     *
     * @param saleListId 出售id列表
     * @return {@link ServiceVO}
     */
    @PostMapping("/updateState")
    public ServiceVO updateState(@RequestParam Integer saleListId){
        saleListGoodsService.updateState(saleListId);
        return ServiceVO.success(null);
    }


    //TODO
    @PostMapping("/count")
    public List<Map<String,Object>> Count(String sTime, String eTime ,Integer goodsTypeId, String codeOrName){
        return saleListGoodsService.count(sTime,eTime,goodsTypeId,codeOrName);
    }


}
