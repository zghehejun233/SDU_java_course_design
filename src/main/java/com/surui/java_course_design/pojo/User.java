package com.surui.java_course_design.pojo;

import lombok.Data;

import java.util.List;

/**
 * @author GuoSurui
 */
@Data
public class User {
    private Integer id;
    private String name;
    private String account;
    private String password;
    private Integer age;
    private Integer sex;
}
