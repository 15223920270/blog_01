package com.zhang.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 *
 *
 * @author Administrator
 * @Description: 关于我界面显示控制器
 * @Date: Created in 11:03 2020/4/17
 * @date 2022/10/12
 */
@Controller
public class AboutShowController {

    @GetMapping("/about")
    public String about() {
        return "about";
    }

}