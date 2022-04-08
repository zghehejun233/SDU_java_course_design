package com.surui.java_course_design.model.dao.course;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * @author GuoSurui
 */
@Mapper
public interface CourseReferenceMapper {

    /**
     * 插入一条课程=参考材料记录
     *
     * @param courseNum     课程号
     * @param referenceName 参考材料名称
     */
    @Insert(value = "INSERT INTO course_reference(course_num, reference_name) VALUES (#{courseNum},#{referenceName})")
     void insertCourseReference(@Param("courseNum") String courseNum, @Param("referenceName") String referenceName);
}
