package com.njzhenghou.mapper;

import com.njzhenghou.domain.Orders;
import com.njzhenghou.domain.OrdersSearch;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface OrdersMapper {
    /*分页查询所有订单*/
    @Select("select username, f_name,orders.total,state,creatime,orders.address,sum,c_name,c_phone,pay_time,close_time,orders.`status`\n" +
            "FROM orders \n" +
            "INNER JOIN `user`  on orders.uid=`user`.id\n" +
            "INNER JOIN flower  on flower.flower.id=orders.fid")
    List<OrdersSearch> selectAllOrders();

    /*查询*/


    /*新增订单*/
     int insertOrders(Orders orders);



}
