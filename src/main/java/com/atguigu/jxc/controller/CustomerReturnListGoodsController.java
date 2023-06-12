package com.atguigu.jxc.controller;

import com.atguigu.jxc.dto.CustomerReturnListGoodsDTO;
import com.atguigu.jxc.entity.CustomerReturnList;
import com.atguigu.jxc.entity.CustomerReturnListGoods;
import com.atguigu.jxc.service.CustomerReturnListGoodsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/customerReturnListGoods")
public class CustomerReturnListGoodsController {

    @Autowired
    private CustomerReturnListGoodsService customerReturnListGoodsService;


    /**
     * {
     * 	"timestamp": "2023-06-11T15:18:35.464+0000",
     * 	"status": 500,
     * 	"error": "Internal Server Error",
     * 	"message": "nested exception is org.apache.ibatis.binding.BindingException: Parameter 'returnNumber' not found. Available parameters are [crlDto, param1]",
     * 	"path": "/customerReturnListGoods/list"
     * }
     * 客户退货单查询（可查询条件：退货单号、客户、退款状态）
     * @param customerReturnListGoodsDTO
     * @return
     */
    @PostMapping("/list")
    public Map<String, Object> saleListGood(CustomerReturnListGoodsDTO customerReturnListGoodsDTO) {
        List<CustomerReturnList> list = customerReturnListGoodsService.getList(customerReturnListGoodsDTO);

        //构建返回值
        HashMap<String, Object> map = new HashMap<>();
        map.put("rows", list);
        return map;
    }

    @PostMapping(value = "/goodsList")
    public Map<String,Object> goodsListInfo(@RequestParam Integer customerReturnListId){
        List<CustomerReturnListGoods> list =  customerReturnListGoodsService.goodsListInfo(customerReturnListId);
        //构建返回值
        HashMap<String, Object> map = new HashMap<>();
        map.put("rows", list);
        return map;
    }

}
