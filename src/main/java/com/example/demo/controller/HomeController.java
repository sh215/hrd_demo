package com.example.demo.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import lombok.extern.slf4j.Slf4j;

@Controller
@Slf4j
public class HomeController {

    @RequestMapping("/")
    public String home() {
        
        log.debug("debug");
        log.warn("warn");
        log.error("error");
        System.out.println("print");

        return "home"; //응답결과가 html
    }
    @RequestMapping("/home2")
    public String home2() {
        return "home";
    }
    @RequestMapping("/home3")
    @ResponseBody//json으로 return하기 위해 필요함
    public List<String> home3() {
        List<String> list = new ArrayList<>();
        list.add("A");
        list.add("B");
        list.add("C");
        return list; //응답결과가 json[]
    }
}
