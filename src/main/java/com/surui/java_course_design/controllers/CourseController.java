package com.surui.java_course_design.controllers;

import com.surui.java_course_design.model.entity.course.Course;
import com.surui.java_course_design.model.entity.course.CourseLocation;
import com.surui.java_course_design.model.entity.course.CourseTime;
import com.surui.java_course_design.model.entity.course.Reference;
import com.surui.java_course_design.service.intf.CourseService;
import com.surui.java_course_design.utils.JsonResponse;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

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
}
