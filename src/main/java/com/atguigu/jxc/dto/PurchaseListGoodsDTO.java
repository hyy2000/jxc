package com.atguigu.jxc.dto;

import lombok.Data;

@Data
public class PurchaseListGoodsDTO {
    private String sTime;
    private String eTime;
    private Integer goodsTypeId;
    private String codeOrName;
}
