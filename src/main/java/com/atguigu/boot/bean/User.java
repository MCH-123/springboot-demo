package com.atguigu.boot.bean;

import lombok.Data;
import lombok.ToString;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Repository;

/**
 * @ClassName User
 * @Description TODO
 * @Author mch
 * @Date 2022/10/28
 * @Version 1.0
 */
@Repository
@Data
@ToString
@ConfigurationProperties(prefix = "user")
public class User {
    private Long id;
    private String userName;
    private String password;
    private String gender;
    private Integer age;
}
