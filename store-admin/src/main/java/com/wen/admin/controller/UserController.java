package com.wen.admin.controller;

import com.wen.admin.service.UserService;
import com.wen.param.CartListParam;
import com.wen.param.PageParam;
import com.wen.pojo.User;
import com.wen.utils.R;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * projectName: b2c-store
 * Author:Wen Xie
 * description: 用户模块调用的controller
 */
@RestController
@RequestMapping("user")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("list")
    public R userList(PageParam pageParam){

        return userService.userList(pageParam);
    }

    @PostMapping("remove")
    public R userList(CartListParam pageParam){

        return userService.userRemove(pageParam);
    }

    @PostMapping("update")
    public R update(User user){

        return userService.userUpdate(user);
    }

    @PostMapping("save")
    public R save(User user){

        return userService.save(user);
    }
}
