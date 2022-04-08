package com.surui.java_course_design.controllers;

import com.surui.java_course_design.model.entity.User;
import com.surui.java_course_design.service.intf.UserService;
import com.surui.java_course_design.utils.JsonResponse;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * @author GuoSurui
 */
@RestController
@RequestMapping(value = "/api/users")
public class UserController {
    @Resource
    private UserService userService;

    @PostMapping(value = "/")
    public JsonResponse<String> postUser(@RequestBody User user) {
        userService.addUser(user);
        return new JsonResponse<>();
    }

    @GetMapping(value = "/{account}")
    public JsonResponse<String> getUser(@PathVariable String account) {
        return new JsonResponse<>();
    }
}
