package com.example.demo;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service     //Component , Service 상관없이 동작
public class Bean33 {
    public String run() {
        return "Bean 33";
        }
        
}
