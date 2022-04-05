package com.surui.java_course_design.service.users;

import com.surui.java_course_design.dao.users.UserMapper;
import com.surui.java_course_design.entity.User;
import org.jetbrains.annotations.NotNull;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author GuoSurui
 */
@Service
public class UserService {
    @Resource
    private UserMapper userMapper;

    public void postUser(@NotNull User user){
        userMapper.insert(user.getName(),user.getAccount(),user.getPassword(),user.getAge(),user.getSex());
    }

}
