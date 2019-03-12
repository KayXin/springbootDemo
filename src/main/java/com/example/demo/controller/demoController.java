package com.example.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by XinKai on 2019/3/12.
 */
@RequestMapping("/springboot")
@RestController
public class demoController {
    @RequestMapping("/hello")
    public String home() {
        return "Hello World!";
    }

    @RequestMapping("/listIndex")
    public List<String> listIndex() {
        List<String> list = new ArrayList<String>();
        list.add("aaaa");
        list.add("bbb");
        list.add("cccccc");
        return list;
    }

    /**
     * 捕获异常
     *
     * @param request
     * @return
     */
    @RequestMapping("/demoError")
    public Integer demoError(HttpServletRequest request) {
        String id = request.getParameter("id");
        Integer idl = Integer.parseInt(id);
        return idl;
    }
}
