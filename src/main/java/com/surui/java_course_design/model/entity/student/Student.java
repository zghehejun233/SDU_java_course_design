package com.surui.java_course_design.model.entity.student;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

/**
 * @author GuoSurui
 */
@Data
public class Student {
    private String name;
    private String number;
    private Integer age;
    private String birthday;
    private List<String> educations = new ArrayList<>();
    private List<String> families = new ArrayList<>();
}
