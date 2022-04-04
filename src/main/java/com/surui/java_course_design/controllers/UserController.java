package com.surui.java_course_design.controllers;

import com.surui.java_course_design.pojo.User;
import com.surui.java_course_design.service.users.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author GuoSurui
 */
@Slf4j
@RestController
@RequestMapping(value = "/api/users")
public class UserController {
    @Resource
    private UserService userService;

    @PostMapping(value = "/")
    public String postUser(@RequestBody User user) {
        log.debug("postUser starts.");
        userService.postUser(user);
        log.debug("postUser finishes.");
        return "OK";
    }
}
