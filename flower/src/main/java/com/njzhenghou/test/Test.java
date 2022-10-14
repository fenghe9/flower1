package com.njzhenghou.test;

import com.njzhenghou.domain.Orders;
import com.njzhenghou.domain.User;
import com.njzhenghou.dto.UserDto;
import com.njzhenghou.mapper.OrdersMapper;
import com.njzhenghou.mapper.UserMapper;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Date;

public class Test {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext ctx=new ClassPathXmlApplicationContext("applicationContext.xml");
        OrdersMapper bean = ctx.getBean(OrdersMapper.class);
        Orders orders=new Orders();
        orders.setUid(1);
        orders.setFid(1);
        orders.setCloseTime(new Date());
        orders.setAddress("鼓楼区");
        orders.setStatus(1);
        int insert = bean.insertOrders(orders);
        System.out.println(insert);

//        UserMapper bean=ctx.getBean(UserMapper.class);
//        Integer cjf = bean.addOne(new UserDto("cyf", "hn"));
//        System.out.println(cjf);

//        UserDto userDto=new UserDto();
//        userDto.setUsername("cjy");
//        userDto.setPassword("1998929");
//        User login = bean.getLogin(userDto);
//        System.out.println(login);


    }

}
