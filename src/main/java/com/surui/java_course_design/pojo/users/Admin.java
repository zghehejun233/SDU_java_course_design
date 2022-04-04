package com.surui.java_course_design.pojo.users;

import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * @author GuoSurui
 */
@EqualsAndHashCode(callSuper = true)
@Data
public class Admin extends User {
    private String email;
}
