package com.surui.java_course_design.model.dao.course;

import com.surui.java_course_design.model.dto.course.CourseReferenceDTO;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * @author GuoSurui
 */
@Mapper
public interface CourseReferenceMapper {
    /**
     * 查询所有
     *
     * @return 返回一个List
     */
    @Select(value = "SELECT * FROM course_reference")
    List<CourseReferenceDTO> findAll();

    /**
     * 插入一条课程-参考材料记录
     *
     * @param courseNum     课程号
     * @param referenceName 参考材料名称
     */
    @Insert(value = "INSERT INTO course_reference(course_num, reference_name) VALUES (#{courseNum},#{referenceName})")
     void insertCourseReference(@Param("courseNum") String courseNum, @Param("referenceName") String referenceName);
}
