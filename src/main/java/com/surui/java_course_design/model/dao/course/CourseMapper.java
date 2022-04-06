package com.surui.java_course_design.model.dao.course;

import com.surui.java_course_design.model.entity.course.Course;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * @author GuoSurui
 */
public interface CourseMapper {
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
    List<Course> findByName(@Param("name") String name);

    /**
     * 添加一条课程信息
     *
     * @param name      课程名
     * @param courseNum 课程号
     * @param teacher   讲师
     * @param classroom 教室
     */
    @Insert("INSERT INTO course(name, course_num,teacher,classroom) VALUES(#{name}, #{courseNum},#{teacher},#{classroom})")
    void insert(@Param("name") String name, @Param("courseNum") String courseNum, @Param("teacher") String teacher, @Param("classroom") String classroom);


    /**
     * 删除一条课程信息
     *
     * @param courseNum 课程号
     */
    @Delete("DELETE FROM course WHERE course_num =#{couseNum}")
    void delete(String courseNum);
}
