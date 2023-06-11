package com.atguigu.jxc.service.impl;

import com.atguigu.jxc.dao.CustomerDao;
import com.atguigu.jxc.dao.CustomerReturnListDao;
import com.atguigu.jxc.dao.UserDao;
import com.atguigu.jxc.dto.CustomerReturnListGoodsDTO;
import com.atguigu.jxc.entity.CustomerReturnList;
import com.atguigu.jxc.service.CustomerReturnListGoodsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerReturnListGoodsImpl implements CustomerReturnListGoodsService {

    @Autowired
    private CustomerReturnListDao customerReturnListDao;

    /**
     * 涉及三张表:t_customer_return_list  t_customer  t_user
     *SELECT tcrl.*,tc.customer_name,tu.true_name FROM t_customer_return_list tcrl
     * LEFT JOIN t_customer tc
     * ON tcrl.customer_id=tc.customer_id
     * LEFT JOIN t_user tu
     * ON tcrl.user_id= tu.user_id
     * WHERE tcrl.customer_id=3
     * @param customerReturnListGoodsDTO 客户返回dto商品列表
     * @return {@link List}<{@link CustomerReturnList}>
     */
    @Override
    public List<CustomerReturnList> getList(CustomerReturnListGoodsDTO customerReturnListGoodsDTO) {

        return customerReturnListDao.getList(customerReturnListGoodsDTO);
    }
}
