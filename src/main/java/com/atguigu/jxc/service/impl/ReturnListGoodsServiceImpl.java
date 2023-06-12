package com.atguigu.jxc.service.impl;

import com.atguigu.jxc.dao.ReturnListGoodsDao;
import com.atguigu.jxc.service.ReturnListGoodsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class ReturnListGoodsServiceImpl implements ReturnListGoodsService {

    @Autowired
    private ReturnListGoodsDao returnListGoodsDao;

    @Override
    public List<Map<String, Object>> count(String sTime, String eTime, Integer goodsTypeId, String codeOrName) {
        return returnListGoodsDao.count(sTime,eTime,goodsTypeId,codeOrName);
    }
}
