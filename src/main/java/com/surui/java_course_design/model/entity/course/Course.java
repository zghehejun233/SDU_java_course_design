package com.surui.java_course_design.model.entity.course;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

/**
 * @author GuoSurui
 */
@Data
public class Course {
    private String name;
    private String courseNum;
    private String teacher;
    private CourseLocation classroom;
}
