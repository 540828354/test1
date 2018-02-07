package com.mygroup.action;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Administrator on 2018/1/23.
 */
@Controller
@RequestMapping("/start")
public class StartAction {
    @RequestMapping("/index")
    public String SayHello() {
        return "index";
    }
}
