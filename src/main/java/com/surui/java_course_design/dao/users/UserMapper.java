package com.surui.java_course_design.dao.users;

import com.surui.java_course_design.pojo.User;
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
     * Class {@code Object} is the root of the class hierarchy.
     * Every class has {@code Object} as a superclass. All objects,
     * including arrays, implement the methods of this class.
     *
     * @param name da.
     * @return das.
     */
    @Select("SELECT * FROM user WHERE name = #{name}}")
    User findByName(@Param("name") String name);


    /**
     * sasd
     *
     * @param name     sd
     * @param account  sda
     * @param password sd
     * @param age      sd
     * @param sex      sd
     */
    @Insert("INSERT INTO user(name, account,password,age,sex) VALUES(#{name},#{account},#{password}, #{age}),#{sex}")
    void insert(@Param("name") String name, @Param("account") String account, @Param("password") String password,
                   @Param("age") Integer age, @Param("sex") Integer sex);
}
