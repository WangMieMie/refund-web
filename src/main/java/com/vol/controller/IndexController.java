package com.vol.controller;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Class IndexController
 * @Descriptions 首页跳转
 * @Author vol
 * @Date 2017/9/6 14:36
 */
@Controller
@RequestMapping("/")
public class IndexController {

    private Logger logger = LogManager.getLogger(IndexController.class);

    @RequestMapping("/")
    public String index() {
        logger.info("the user login-----------------------");
        return "login";
    }
}