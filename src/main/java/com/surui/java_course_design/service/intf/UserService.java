package com.surui.java_course_design.service.intf;

import com.surui.java_course_design.model.entity.User;
import com.surui.java_course_design.service.impl.UserImpl;
import org.jetbrains.annotations.NotNull;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author GuoSurui
 */
@Service
public class UserService {
    @Resource
    UserImpl userImpl;

    public void addUser(@NotNull User user){
        userImpl.insertUser(user);
    }

}
