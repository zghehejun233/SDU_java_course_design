package com.surui.java_course_design.model.dto.course;

import com.surui.java_course_design.model.entity.course.Course;
import com.surui.java_course_design.model.entity.course.CourseTime;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * @author GuoSurui
 */
@ToString
@Setter
@Getter
public class CourseTimeDTO {
    private Course course;
    private CourseTime time;
}
