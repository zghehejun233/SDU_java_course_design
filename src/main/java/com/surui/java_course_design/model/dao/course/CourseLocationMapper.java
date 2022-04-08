package com.surui.java_course_design.model.dao.course;

import com.surui.java_course_design.model.entity.course.Course;
import com.surui.java_course_design.model.entity.course.CourseLocation;
import org.apache.ibatis.annotations.*;

import java.util.List;

/**
 * @author GuoSurui
 */
@Mapper
public interface CourseLocationMapper {
    /**
     * 查询所有
     *
     * @return 所有课程地点
     */
    @Select("SELECT * FROM course_location ")
    List<CourseLocation> findAll();

    /**
     * 添加一条课程地点信息
     *
     * @param campus   校区
     * @param building 建筑
     * @param room     教室
     */
    @Insert("INSERT INTO course_location(campus, building, room) VALUES(#{campus},#{building},#{room})")
    void insert(@Param("campus") String campus, @Param("building") String building, @Param("room") String room);


    /**
     * 删除一条课程位置信息
     *
     * @param room 教室
     */
    @Delete("DELETE FROM course_location WHERE room =#{room}")
    void delete(String room);
}
