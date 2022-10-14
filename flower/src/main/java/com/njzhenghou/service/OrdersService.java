package com.njzhenghou.service;

import com.njzhenghou.commom.Result;

public interface OrdersService {
    /*分页查询全部*/
    Result selectAllOrders(int pageNum,int pageSize);
}
