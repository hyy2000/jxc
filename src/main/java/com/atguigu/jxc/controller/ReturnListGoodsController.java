package com.atguigu.jxc.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping(value = "/returnListGoods")
public class ReturnListGoodsController {



    @PostMapping("list")
    public Map<String,Object> ListGoods(){
        return null;
    }
}
