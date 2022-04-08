package com.surui.java_course_design.controllers;

import com.surui.java_course_design.model.entity.course.Course;
import com.surui.java_course_design.model.entity.course.CourseLocation;
import com.surui.java_course_design.model.entity.course.CourseTime;
import com.surui.java_course_design.model.entity.course.Reference;
import com.surui.java_course_design.service.intf.CourseService;
import com.surui.java_course_design.utils.JsonResponse;
import lombok.Getter;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Param;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author GuoSurui
 */
@RestController
@RequestMapping(value = "/api/courses")
public class CourseController {
    @Resource
    private CourseService courseService;

    @PostMapping(value = "/courses")
    public JsonResponse<String> postCourse(@RequestBody Course course) {
        courseService.addCourse(course);
        return new JsonResponse<>("OK");
    }

    @GetMapping(value = "/courses")
    public JsonResponse<List<Course>> getAllCourse() {
        List<Course> result = courseService.findAllCourses();
        return new JsonResponse<>(result);
    }

    @GetMapping(value = "/courses/{courseNum}")
    public JsonResponse<Course> getCourse(@PathVariable("courseNum") String courseNum) {
        return new JsonResponse<>(courseService.findCourseByNum(courseNum));
    }

    @DeleteMapping(value = "/courses/{courseNum}")
    public JsonResponse<String> deleteCourse(@PathVariable("courseNum") String courseNum) {
        courseService.deleteCourse(courseNum);
        return new JsonResponse<>("OK");
    }

    @PostMapping(value = "/course-locations")
    public JsonResponse<String> postCourseLocation(@RequestBody CourseLocation courseLocation) {
        courseService.addCourseLocation(courseLocation);
        return new JsonResponse<>("OK");
    }

    @PostMapping(value = "/course-times")
    public JsonResponse<String> postCourseTime(@RequestBody CourseTime courseTime) {
        courseService.addCourseTime(courseTime);
        return new JsonResponse<>("OK");
    }

    @PostMapping(value = "/references")
    public JsonResponse<String> postReference(@RequestBody Reference reference) {
        courseService.addReference(reference);
        return new JsonResponse<>("OK");
    }

    @PostMapping(value = "/course-references")
    public JsonResponse<String> postCourseReference(@Param("course_num") String courseNum, @Param("reference_name") String referenceName) {
        courseService.addCourseReference(courseService.findCourseByNum(courseNum), courseService.findReferenceByName(referenceName));
        return new JsonResponse<>("OK");
    }
}
