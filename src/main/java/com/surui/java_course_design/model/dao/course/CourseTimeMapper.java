package com.surui.java_course_design.model.dao.course;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * @author GuoSurui
 */
@Mapper
public interface CourseTimeMapper {
    /**
     * 插入一条课程时间
     *
     * @param day       周几
     * @param time      第几节课
     * @param beginWeek 开始周
     * @param endWeek   结束周
     */
    @Insert("INSERT INTO course_time(day, time, begin_week, end_week) VALUES (#{day},#{time},#{beginWeek},#{endWeek})")
    void insert(@Param("day") String day, @Param("time") Integer time, @Param("beginWeek") Integer beginWeek, @Param("endWeek") Integer endWeek);

}
