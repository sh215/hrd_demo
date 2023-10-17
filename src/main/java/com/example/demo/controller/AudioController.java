package com.example.demo.controller;



import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;




@Controller

public class AudioController {

    @RequestMapping("/audio")
    public String home() {
        

        return "home"; //응답결과가 html
    }
    
}
