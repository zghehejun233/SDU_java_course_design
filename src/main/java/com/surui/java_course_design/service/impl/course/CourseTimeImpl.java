package com.surui.java_course_design.service.impl.course;

import com.surui.java_course_design.model.dao.course.CourseTimeMapper;
import com.surui.java_course_design.model.entity.course.CourseTime;
import org.jetbrains.annotations.NotNull;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author GuoSurui
 */
@Service
public class CourseTimeImpl {
    @Resource
    private CourseTimeMapper courseTimeMapper;

    public void insertCourseTime(@NotNull CourseTime courseTime) {
        courseTimeMapper.insert(courseTime.getDay(), courseTime.getTime(), courseTime.getBeginWeek(), courseTime.getEndWeek());
    }
}
