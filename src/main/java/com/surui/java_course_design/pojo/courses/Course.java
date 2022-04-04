package com.surui.java_course_design.pojo.courses;

import lombok.Data;

/**
 * @author GuoSurui
 */
@Data
public class Course {
    private Integer id;
    private String name;
    private String teacher;
    private String classroom;
    private Integer week;
}
