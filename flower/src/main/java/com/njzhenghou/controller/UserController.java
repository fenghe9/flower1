package com.njzhenghou.controller;

import com.njzhenghou.commom.Result;
import com.njzhenghou.dto.UserDto;
import com.njzhenghou.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService userService;

    @GetMapping("/getLogin")
    public Result getLogin(UserDto userDto){
        return userService.findLogin(userDto);
    }

    @GetMapping("/addOne")
    public Result addOne(UserDto userDto){
        return userService.addOne(userDto);
    }

}
