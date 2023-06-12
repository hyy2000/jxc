package com.atguigu.jxc.controller;

import com.atguigu.jxc.domain.ServiceVO;
import com.atguigu.jxc.service.PurchaseListGoodsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

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

}
