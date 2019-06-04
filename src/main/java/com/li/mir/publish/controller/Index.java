package com.li.mir.publish.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.ui.Model;

/**
 * Created by lining on 2019/6/4.
 *
 * @author lining
 * @date 2019/06/04
 */

@Controller
public class Index {

    @RequestMapping("/")
    @ResponseBody
    public String index() {
        return "this is a get request data";
    }

}



