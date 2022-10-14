package com.njzhenghou.controller;

import com.njzhenghou.commom.Result;
import com.njzhenghou.service.OrdersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/orders")
public class OrdersController {

    @Autowired
    private OrdersService ordersService;


    @PostMapping("/selectAllOrders")
    public Result selectAllOrders(Integer pageNum,@RequestParam(required = false,defaultValue = "5") Integer pageSize ){
        return ordersService.selectAllOrders(pageNum,pageSize);
    }
}
