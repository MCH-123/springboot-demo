package com.atguigu.boot.controller;

import com.atguigu.boot.bean.User;
import com.atguigu.boot.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

/**
 * @ClassName TableController
 * @Description TODO
 * @Author mch
 * @Date 2022/10/28
 * @Version 1.0
 */
@Controller
public class TableController {
    @Autowired
    private UserService userService;
    @GetMapping("/basic_table")
    public String basic_table() {
        return "table/basic_table";
    }
    @GetMapping("/dynamic_table")
    public String dynamic_table(Model model) {
        List<User> users = userService.findAll();
        model.addAttribute("users", users);
        return "table/dynamic_table";
    }
    @GetMapping("/editable_table")
    public String editable_table() {
        return "table/editable_table";
    }
    @GetMapping("/pricing_table")
    public String pricing_table() {
        return "table/pricing_table";
    }
    @GetMapping("/responsive_table")
    public String responsive_table() {
        return "table/responsive_table";
    }
}
