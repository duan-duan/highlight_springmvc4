package com.duan;

/**
 * @author: wangruirui .
 * @date: 2017/9/17.
 * @description: .
 */

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloController {


    @RequestMapping("/index")
    public String hello (){
        return "index";
    }


}
