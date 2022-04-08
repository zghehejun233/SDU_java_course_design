package com.surui.java_course_design.model.entity.course;

import lombok.Data;

/**
 * @author GuoSurui
 */
@Data
public class CourseTime {
    private String day;
    private Integer time;
    private Integer beginWeek;
    private Integer endWeek;
}
