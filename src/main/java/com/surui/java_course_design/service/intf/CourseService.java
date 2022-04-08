package com.surui.java_course_design.service.intf;

import com.surui.java_course_design.model.entity.course.Course;
import com.surui.java_course_design.model.entity.course.CourseLocation;
import com.surui.java_course_design.service.impl.course.CourseImpl;
import com.surui.java_course_design.service.impl.course.CourseLocationImpl;
import org.jetbrains.annotations.NotNull;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author GuoSurui
 */
@Service
public class CourseService {
    @Resource
    private CourseImpl courseImpl;

    public void addCourse(@NotNull Course course) {
        courseImpl.postCourse(course);
    }

    @Resource
    private CourseLocationImpl courseLocationImpl;

    public void addCourseLocation(@NotNull CourseLocation courseLocation) {
        courseLocationImpl.insertCourseLocation(courseLocation);
    }
}
