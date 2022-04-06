package com.surui.java_course_design.model.entity;

import lombok.Data;

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
