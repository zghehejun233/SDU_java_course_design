package com.surui.java_course_design.service.impl.course;

import com.surui.java_course_design.model.dao.course.CourseMapper;
import com.surui.java_course_design.model.entity.course.Course;
import lombok.extern.slf4j.Slf4j;
import org.jetbrains.annotations.NotNull;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author GuoSurui
 */
@Slf4j
@Service
public class CourseImpl {
    @Resource
    private CourseMapper courseMapper;

    public void insertCourse(@NotNull Course course) {
        courseMapper.insert(course.getName(), course.getCourseNum(), course.getTeacher(), course.getClassroom().toString());
    }

    public List<Course> findAll() {
        log.error(courseMapper.findAll().toString());
        return courseMapper.findAll();
    }

    public Course findByCourseNum(@NotNull String courseNum) {
        log.error(courseMapper.findByCourseNum(courseNum).toString());
        return courseMapper.findByCourseNum(courseNum);
    }

    public List<Course> findByCourseName(@NotNull String courseName) {
        return courseMapper.findByCourseName(courseName);
    }

    public void deleteByCourseNum(@NotNull String courseNum) {
        courseMapper.deleteByCourseNum(courseNum);
    }
}
