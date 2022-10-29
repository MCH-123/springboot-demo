package com.atguigu.boot.controller;

import com.atguigu.boot.bean.User;
import com.atguigu.boot.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import javax.servlet.http.HttpSession;

/**
 * @ClassName IndexController
 * @Description TODO
 * @Author mch
 * @Date 2022/10/28
 * @Version 1.0
 */
@Controller
public class IndexController {
    @Autowired
    private UserService userService;

    @GetMapping(value = {"/", "/login"})
    public String login() {
        return "login";
    }

    @PostMapping("/login")
    public String main(User user, HttpSession session, Model model) {
        User userDB = userService.findUserById(1L);
        if (userDB.getUserName().equals(user.getUserName()) && userDB.getPassword().equals(user.getPassword())) {
            session.setAttribute("user", user);
            model.addAttribute("user", user);
            return "redirect:/main.html";
        }
        model.addAttribute("msg", "账号或密码错误");
        return "login";
    }

    @GetMapping("/main.html")
    public String mainPage(HttpSession session,Model model) {
        Object user = session.getAttribute("user");
        if (user != null) {
            return "main";
        }
        model.addAttribute("msg","请重新登录");
        return "login";
    }
}
