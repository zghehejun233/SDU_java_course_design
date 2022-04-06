package com.surui.java_course_design.service.intf;

import com.surui.java_course_design.model.entity.course.Course;
import com.surui.java_course_design.service.impl.course.CourseService;
import org.jetbrains.annotations.NotNull;

import javax.annotation.Resource;

/**
 * @author GuoSurui
 */
public class CourseServiceDefinition {
    @Resource
    private CourseService courseService;

    public void addCourse(@NotNull Course course) {
        courseService.postCourse(course);
    }
}
