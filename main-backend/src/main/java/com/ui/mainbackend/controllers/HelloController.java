package com.ui.mainbackend.controllers;


import com.ui.mainbackend.models.HelloModel;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/")
    public HelloModel hello(@RequestParam(name = "name") String name) {
        return new HelloModel(name);
    }
}
