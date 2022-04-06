package com.surui.java_course_design.service.impl.course;

import com.surui.java_course_design.model.dao.course.CourseMapper;
import com.surui.java_course_design.model.entity.course.Course;
import org.jetbrains.annotations.NotNull;

import javax.annotation.Resource;

/**
 * @author GuoSurui
 */
public class CourseService {
    @Resource
    private CourseMapper courseMapper;

    public void postCourse(@NotNull Course course){
        courseMapper.insert(course.getName(), course.getCourseNum(), course.getTeacher(),course.getClassroom().toString());
    }
}
