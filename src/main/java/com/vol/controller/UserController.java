package com.vol.controller;

import com.vol.beans.User;
import com.vol.service.UserService;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;


/**
 * @Class UserController
 * @Descriptions 用户操作
 * @Author vol
 * @Date 2017/9/6 14:02
 */
@Controller
@RequestMapping("/users")
public class UserController {

    private Logger logger = LogManager.getLogger(UserController.class);

    @Autowired
    private UserService userService;

    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public String login(@ModelAttribute("user") User user, Model model) {
        logger.info("用户登录操作: " + user.getUsername());
        boolean bool = userService.login(user);
        if (bool) {
            return "index";
        }
        model.addAttribute("info", "用户名或密码错误");
        return "login";
    }

}
