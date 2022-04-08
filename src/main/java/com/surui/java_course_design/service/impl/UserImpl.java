package com.surui.java_course_design.service.impl;

import com.surui.java_course_design.model.dao.UserMapper;
import com.surui.java_course_design.model.entity.User;
import org.jetbrains.annotations.NotNull;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author GuoSurui
 */
@Service
public class UserImpl {
    @Resource
    private UserMapper userMapper;

    public void insertUser(@NotNull User user){
        userMapper.insert(user.getName(),user.getAccount(),user.getPassword(),user.getAge(),user.getSex());
    }

}
