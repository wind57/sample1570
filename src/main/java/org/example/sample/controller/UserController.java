package org.example.sample.controller;

import lombok.extern.slf4j.Slf4j;
import org.example.sample.properties.UserInfoProperties;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequestMapping("/user/")
@EnableConfigurationProperties(UserInfoProperties.class)
public class UserController {

    private final UserInfoProperties properties;

    UserController(UserInfoProperties properties) {
        this.properties = properties;
    }

    @GetMapping("/name")
    public String name() {
        return properties.getName() + "name is : " + properties.getName();
    }
}
