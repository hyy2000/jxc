package com.atguigu.jxc.controller;

import com.atguigu.jxc.domain.ServiceVO;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/purchaseListGoods")
@RestController
public class PurchaseListGoodsController {

    //支付结算（修改进货单付款状态）
    @PostMapping("updateState")
    public ServiceVO updateState(Integer purchaseListId){

        return ServiceVO.success(null);
    }

}
