package com.example.demo;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service     //Component , Service 상관없이 동작
public class Game {
    public void play() {
        System.out.println("Play Game");
        }
        
        
}
