package com.example.liwinli.controller;

import com.example.liwinli.pojo.vo.DemoUserVO;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloController {
    @ResponseBody
    @RequestMapping(value = "/hello")
    public String sayHello() { return "Hello, world!"; }

    @ResponseBody
    @RequestMapping(value = "/users")
    public DemoUserVO getDemoUserVo() {
        DemoUserVO vo = new DemoUserVO();
        vo.setUser_name("Liwin Lee"); vo.setPassword("lt52310431");
        return vo;
    }
}
