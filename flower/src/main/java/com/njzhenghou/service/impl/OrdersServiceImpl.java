package com.njzhenghou.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.njzhenghou.commom.Result;
import com.njzhenghou.domain.Orders;
import com.njzhenghou.domain.OrdersSearch;
import com.njzhenghou.mapper.OrdersMapper;
import com.njzhenghou.service.OrdersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
@Service
@Transactional
public class OrdersServiceImpl implements OrdersService {
    @Autowired
    OrdersMapper ordersMapper;

    @Override
    public Result selectAllOrders(int pageNum, int pageSize) {
        PageHelper.startPage(pageNum,pageSize);
        List<OrdersSearch> orders=ordersMapper.selectAllOrders();

        PageInfo<OrdersSearch> pageInfo=new PageInfo<>(orders);
        Result result=new Result();

        result.setTotal(pageInfo.getTotal());
        result.setData(pageInfo.getList());
        return result;
    }
}
