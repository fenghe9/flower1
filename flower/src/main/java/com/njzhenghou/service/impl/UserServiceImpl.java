package com.njzhenghou.service.impl;

import com.njzhenghou.commom.Constans;
import com.njzhenghou.commom.Result;
import com.njzhenghou.domain.User;
import com.njzhenghou.dto.UserDto;
import com.njzhenghou.mapper.UserMapper;
import com.njzhenghou.service.UserService;
import com.njzhenghou.utils.MD5Utils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


@Service
@Transactional
public class UserServiceImpl implements UserService {
   @Autowired
   private UserMapper userMapper;

    @Override
    public Result findLogin(UserDto userDto) {
        /*将获取到的密码加密操作*/
        String encry = MD5Utils.findMD5(userDto.getPassword());
        /*将加密后的密码设置到数据中*/
        userDto.setPassword(encry);
        /*根据条件查询*/
        User user=userMapper.getLogin(userDto);
        /*如果查询结果为null 没有给对应的提示*/
        if (user==null){
            return new Result(-1,"用户名或密码错误");
        }
        Result result=new Result();
        result.setData(user);
        return result;
    }

    public Result addOne(UserDto userDto){

        /*将获取到的密码加密操作*/
        String encry = MD5Utils.findMD5(userDto.getPassword());
        /*将加密后的密码设置到数据中*/
        userDto.setPassword(encry);

        /*用户名是否存在*/
        Integer i=userMapper.selectUserNameIsExit(userDto);
        if (i==1){
            return new Result(-1,"用户名已经存在");
        }


        Integer integer = userMapper.addOne(userDto);
        if (integer==0){
            return new Result(-1,"注册失败");
        }

        Result result=new Result();
        result.setData(integer);
        return result;
    }



}
