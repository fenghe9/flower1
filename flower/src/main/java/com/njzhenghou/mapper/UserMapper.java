package com.njzhenghou.mapper;

import com.njzhenghou.domain.User;
import com.njzhenghou.dto.UserDto;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

@Repository
public interface UserMapper {
    //用户登录
    User  getLogin(UserDto userDto);

    //用户注册
    Integer addOne(UserDto userDto);



    //查询是否存在此用户
    @Select("SELECT COUNT(*) FROM USER WHERE username=#{username} ")
    Integer selectUserNameIsExit(UserDto userDto);

//    @Select("SELECT COUNT(*) FROM USER WHERE tel=#{tel} ")
//    Integer selectUTelIsExit(UserDto userDto);
//
//    @Select("SELECT COUNT(*) FROM USER WHERE email=#{email} ")
//    Integer selectEmailIsExit(UserDto userDto);


}
