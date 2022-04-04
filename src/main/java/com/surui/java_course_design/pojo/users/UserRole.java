package com.surui.java_course_design.pojo.users;

import lombok.Data;

/**
 * @author guosurui
 */
@Data
public class UserRole {
    private Integer id;
    private String roleName;
    private String roleType;
    private String description;
}
