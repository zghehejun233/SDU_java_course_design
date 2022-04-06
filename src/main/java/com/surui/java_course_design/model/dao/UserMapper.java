package com.surui.java_course_design.model.dao;

import com.surui.java_course_design.model.entity.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

/**
 * @author GuoSurui
 */
@Mapper
public interface UserMapper {
    /**
     * 根据用户名查询用户
     *
     * @param name 用户名
     * @return 返回查询到的用户
     */
    @Select("SELECT * FROM user WHERE name = #{name}}")
    User findByName(@Param("name") String name);


    /**
     * 添加用户
     *
     * @param name     用户名
     * @param account  账号
     * @param password 密码
     * @param age      年龄
     * @param sex      性别
     */
    @Insert("INSERT INTO user(name, account,password,age,sex) VALUES(#{name},#{account},#{password}, #{age},#{sex})")
    void insert(@Param("name") String name, @Param("account") String account, @Param("password") String password,
                @Param("age") Integer age, @Param("sex") Integer sex);
}
