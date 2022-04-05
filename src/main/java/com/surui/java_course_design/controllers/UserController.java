package com.surui.java_course_design.controllers;

import com.surui.java_course_design.entity.User;
import com.surui.java_course_design.service.users.UserService;
import com.surui.java_course_design.utils.JsonResponse;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

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
    public JsonResponse<String> postUser(@RequestBody User user) {
        log.debug("postUser starts.");
        userService.postUser(user);
        log.debug("postUser finishes.");
        return new JsonResponse<>();
    }

    @GetMapping(value = "/{account}")
    public JsonResponse<String> getUser(@PathVariable String account) {
        return new JsonResponse<>();
    }
}
