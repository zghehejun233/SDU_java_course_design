package com.surui.java_course_design.service.intf;

import com.surui.java_course_design.model.entity.User;
import com.surui.java_course_design.service.impl.UserService;
import org.jetbrains.annotations.NotNull;

import javax.annotation.Resource;

/**
 * @author GuoSurui
 */
public class UserServiceDefinition {
    @Resource
    UserService userService;

    public void addUser(@NotNull User user){
        userService.insertUser(user);
    }

}
