package com.atguigu.boot.dao;

import com.atguigu.boot.bean.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @ClassName UserDao
 * @Description TODO
 * @Author mch
 * @Date 2022/10/28
 * @Version 1.0
 */
@Mapper
public interface UserDao {
    User findUserById(Long id);

    List<User> findAll();
}
