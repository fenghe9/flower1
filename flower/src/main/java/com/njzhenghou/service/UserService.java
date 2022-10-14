package com.njzhenghou.service;

import com.njzhenghou.commom.Result;
import com.njzhenghou.dto.UserDto;

public interface UserService {
    Result findLogin(UserDto userDto);

    public Result addOne(UserDto userDto);


}
