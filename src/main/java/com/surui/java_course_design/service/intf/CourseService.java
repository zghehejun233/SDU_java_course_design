package com.surui.java_course_design.service.intf;

import com.surui.java_course_design.model.entity.course.Course;
import com.surui.java_course_design.model.entity.course.CourseLocation;
import com.surui.java_course_design.model.entity.course.CourseTime;
import com.surui.java_course_design.service.impl.course.CourseImpl;
import com.surui.java_course_design.service.impl.course.CourseLocationImpl;
import com.surui.java_course_design.service.impl.course.CourseTimeImpl;
import org.jetbrains.annotations.NotNull;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author GuoSurui
 */
@Service
public class CourseService {
    @Resource
    private CourseImpl course;

    public void addCourse(@NotNull Course course) {
        this.course.postCourse(course);
    }

    @Resource
    private CourseLocationImpl courseLocation;

    public void addCourseLocation(@NotNull CourseLocation courseLocation) {
        this.courseLocation.insertCourseLocation(courseLocation);
    }

    @Resource
    private CourseTimeImpl courseTime;

    public void addCourseTime(@NotNull CourseTime courseTime) {
        this.courseTime.insertCourseTime(courseTime);
    }
}
