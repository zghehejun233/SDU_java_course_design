package com.surui.java_course_design.service.impl.course;

import com.surui.java_course_design.model.dao.course.CourseReferenceMapper;
import com.surui.java_course_design.model.dto.course.CourseReferenceDTO;
import org.jetbrains.annotations.NotNull;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author GuoSurui
 */
@Service
public class CourseReferenceImpl {
    @Resource
    private CourseReferenceMapper courseReferenceMapper;

    public void insertCourseReference(@NotNull CourseReferenceDTO courseReferenceDTO) {
        courseReferenceMapper.insertCourseReference(courseReferenceDTO.getCourse().getCourseNum(),
                courseReferenceDTO.getReference().getName());
    }
}
