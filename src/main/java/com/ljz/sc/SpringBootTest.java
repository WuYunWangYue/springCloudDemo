package com.ljz.sc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@SpringBootApplication
public class SpringBootTest {

    @ResponseBody
    @RequestMapping(value = "/")
    String location() {
        return "上海浦江镇";
    }

    public static void main(String[] args) {
        SpringApplication.run(SpringBootTest.class, args);
    }
}
