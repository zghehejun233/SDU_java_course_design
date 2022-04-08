package com.surui.java_course_design.service.impl.course;

import com.surui.java_course_design.model.dao.course.CourseLocationMapper;
import com.surui.java_course_design.model.entity.course.CourseLocation;
import org.jetbrains.annotations.NotNull;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author GuoSurui
 */
@Service
public class CourseLocationImpl {
    @Resource
    private CourseLocationMapper courseLocationMapper;

    public void insertCourseLocation(@NotNull CourseLocation courseLocation) {
        courseLocationMapper.insert(courseLocation.getCampus(), courseLocation.getBuilding(), courseLocation.getRoom());
    }
}
