package com.surui.java_course_design.model.dao.course;

import com.surui.java_course_design.model.entity.course.Course;
import org.apache.ibatis.annotations.*;

import java.util.List;

/**
 * @author GuoSurui
 */
@Mapper
public interface CourseMapper {
    /**
     * 查找所有
     *
     * @return 结果用数组表示
     */
    @Select(value = "SELECT * FROM course")
    List<Course> findAll();

    /**
     * 根据课程号查找课程
     *
     * @param courseNum 课程号
     * @return 课程对象
     */
    @Select("SELECT * FROM course WHERE course.course_num = #{courseNum}")
    Course findByCourseNum(@Param("courseNum") String courseNum);

    /**
     * 根据课程名查找课程
     *
     * @param name 课程名
     * @return 课程对象
     */
    @Select("SELECT * FROM course WHERE course.name = #{name}")
    List<Course> findByCourseName(@Param("name") String name);

    /**
     * 添加一条课程信息
     *
     * @param name      课程名
     * @param courseNum 课程号
     * @param teacher   讲师
     * @param classroom 教室
     */
    @Insert("INSERT INTO course(name, course_num,teacher,classroom) VALUES(#{name}, #{courseNum},#{teacher},#{classroom})")
    void insert(@Param("name") String name, @Param("courseNum") String courseNum, @Param("teacher") String teacher,
                @Param("classroom") String classroom);


    /**
     * 删除一条课程信息
     *
     * @param courseNum 课程号
     */
    @Delete("DELETE FROM course WHERE course_num =#{couseNum}")
    void deleteByCourseNum(String courseNum);
}
