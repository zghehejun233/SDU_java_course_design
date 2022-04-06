package com.surui.java_course_design.controllers;

import com.surui.java_course_design.model.entity.course.Course;
import com.surui.java_course_design.service.intf.CourseServiceDefinition;
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
    private CourseServiceDefinition courseServiceDefinition;

    @PostMapping(value = "/courses")
    public JsonResponse<String> postCourse(@RequestBody Course course){
        courseServiceDefinition.addCourse(course);
        return new JsonResponse("OK");
    }
}
