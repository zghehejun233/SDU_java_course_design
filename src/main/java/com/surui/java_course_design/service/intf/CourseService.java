package com.surui.java_course_design.service.intf;

import com.surui.java_course_design.model.dto.course.CourseReferenceDTO;
import com.surui.java_course_design.model.entity.course.Course;
import com.surui.java_course_design.model.entity.course.CourseLocation;
import com.surui.java_course_design.model.entity.course.CourseTime;
import com.surui.java_course_design.model.entity.course.Reference;
import com.surui.java_course_design.service.impl.course.*;
import org.jetbrains.annotations.NotNull;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author GuoSurui
 */
@Service
public class CourseService {
    @Resource
    private CourseImpl course;

    public void addCourse(@NotNull Course course) {
        this.course.insertCourse(course);
    }

    public List<Course> findAllCourses() {
        return this.course.findAll();
    }

    public Course findCourseByNum(@NotNull String courseNum) {
        return this.course.findByCourseNum(courseNum);
    }

    public List<Course> findCourseByName(@NotNull String courseName) {
        return this.course.findByCourseName(courseName);
    }

    public void deleteCourse(@NotNull String courseNum) {
        this.course.deleteByCourseNum(courseNum);
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

    @Resource
    private ReferenceImpl reference;

    public Reference findReferenceByName(@NotNull String referenceName) {
        return this.reference.findReferenceByName(referenceName);
    }

    public void addReference(@NotNull Reference reference) {
        this.reference.insertReference(reference);
    }

    @Resource
    private CourseReferenceImpl courseReference;


    public void addCourseReference(@NotNull Course course, @NotNull Reference reference) {
        CourseReferenceDTO courseReferenceDTO = new CourseReferenceDTO(course, reference);
        this.courseReference.insertCourseReference(courseReferenceDTO);
    }
}
