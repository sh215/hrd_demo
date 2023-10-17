package com.example.demo.config;
import com.example.demo.Game;

import java.util.Calendar;
import java.util.Random;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

import com.example.demo.Game;

@Configuration
// @ImportResource("classpath:application.xml") // 1,2,3 다같이 쓰고자 할때 사용(Annotation~~ 사용할때)
@ComponentScan(basePackages = "com.example.demo")
public class BeanConfig {
    @Bean
    public Game game() {
        return new Game();
    }
    

    // @Bean
    // public String bean1(){
    // return new String("Bean 1");
    // }
    // @Bean
    // public Random bean2(){
    // return new Random();
    // }
    // @Bean
    // public Calendar bean3(){
    // return Calendar.getInstance();
    // }
}
