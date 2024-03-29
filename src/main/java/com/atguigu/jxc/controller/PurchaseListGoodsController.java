package com.atguigu.jxc.controller;

import com.atguigu.jxc.domain.ServiceVO;
import com.atguigu.jxc.dto.PurchaseListGoodsDTO;
import com.atguigu.jxc.service.PurchaseListGoodsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

@RequestMapping("/purchaseListGoods")
@RestController
public class PurchaseListGoodsController {

    @Autowired
    private PurchaseListGoodsService purchaseListGoodsService;


    /**
     * 更新状态
     * 支付结算（修改进货单付款状态）
     * t_purchase_list
     * @param purchaseListId 购买id列表
     * @return {@link ServiceVO}
     */
    @PostMapping("updateState")
    public ServiceVO updateState(@RequestParam Integer purchaseListId){
        purchaseListGoodsService.updateState(purchaseListId);
        return ServiceVO.success(null);
    }

    /**
     * 进货统计（可根据 商品类别、商品编码或名称 条件查询）
     *
     * @param purchaseListGoodsDTO 购买商品列表dto
     * @return {@link List}<{@link Map}<{@link String},{@link Object}>>
     */
    //TODO 条件查询
    @PostMapping("/count")
    public List<Map<String,Object>> purchaseList(PurchaseListGoodsDTO purchaseListGoodsDTO){
        List<Map<String,Object>> list = purchaseListGoodsService.purchaseList(purchaseListGoodsDTO);
        return list;
    }

}
