package com.surui.java_course_design.controllers;

import com.surui.java_course_design.pojo.User;
import com.surui.java_course_design.service.users.UserService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author GuoSurui
 */
@RestController
@RequestMapping(value = "/api/users")
public class UserController {
    @Resource
    private UserService userService;

    @PostMapping
    public String postUser(@RequestBody User user) {
        userService.postUser(user);
        return "OK";
    }
}
