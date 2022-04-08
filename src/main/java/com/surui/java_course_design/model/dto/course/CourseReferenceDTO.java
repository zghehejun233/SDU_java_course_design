package com.surui.java_course_design.model.dto.course;

import com.surui.java_course_design.model.entity.course.Course;
import com.surui.java_course_design.model.entity.course.Reference;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * @author GuoSurui
 */
@Data
public class CourseReferenceDTO {
    private Course course;
    private Reference reference;

    public CourseReferenceDTO(Course course, Reference reference) {
    }
}
