package com.atguigu.boot.controller;

import com.atguigu.boot.bean.User;
import com.atguigu.boot.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName UserController
 * @Description TODO
 * @Author mch
 * @Date 2022/10/28
 * @Version 1.0
 */
@RestController
@Slf4j
public class UserController {
    @Autowired
    private UserService userService;

    @RequestMapping("/get/{id}")
    public User getUser(@PathVariable Long id) {
        User user = userService.findUserById(id);
        log.info(user.toString());
        return user;
    }
}
