package com.ssq.swagger.web;

import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @ApiOperation(value = "欢迎",notes = "Hello notes")
    @GetMapping("/hello")
    public String hello(){
        return "hello swagger";
    }

}
