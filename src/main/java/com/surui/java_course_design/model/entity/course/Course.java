package com.surui.java_course_design.model.entity.course;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

/**
 * @author GuoSurui
 */
@Data
public class Course {
    private Integer id;
    private String name;
    private String courseNum;
    private String teacher;
    private CourseLocation classroom;
    private List<Reference> referenceMaterials = new ArrayList<>();
    private List<CourseTime> times = new ArrayList<>();
}
