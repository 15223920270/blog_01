package com.zhang.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * 音乐显示控制器
 *
 * @author Administrator
 * @Description: 音乐盒页面显示控制器
 * @date 2022/10/12
 */
@Controller
public class MusicShowController {

    @GetMapping("/music")
    public String about() {
        return "music";
    }

}