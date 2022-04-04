package com.surui.java_course_design.dao.users;

import com.surui.java_course_design.pojo.users.Admin;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

/**
 * @author GuoSurui
 */
@Mapper
public interface AdminMapper {
    /**
     * Class {@code Object} is the root of the class hierarchy.
     * Every class has {@code Object} as a superclass. All objects,
     * including arrays, implement the methods of this class.
     * @param name da.
     * @return das.
     */
    @Select("SELECT * FROM ADMIN WHERE NAME = #{name}}")
    Admin findByName(@Param("name") String name);
}
