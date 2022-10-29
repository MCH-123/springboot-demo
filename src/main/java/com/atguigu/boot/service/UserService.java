package com.atguigu.boot.service;

import com.atguigu.boot.bean.User;

import java.util.List;

/**
 * @ClassName UserService
 * @Description TODO
 * @Author mch
 * @Date 2022/10/28
 * @Version 1.0
 */
public interface UserService {
    User findUserById(Long id);

    List<User> findAll();
}
