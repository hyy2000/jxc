package com.atguigu.jxc.dto;

import lombok.Data;

@Data
public class CustomerReturnListGoodsDTO {

    private String returnNumber;
    private Integer customerId;
    private Integer state;
    private String sTime;
    private String eTime;
}
