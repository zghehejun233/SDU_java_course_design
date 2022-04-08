package com.surui.java_course_design.model.dao.course;

import com.surui.java_course_design.model.entity.course.Reference;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.jetbrains.annotations.NotNull;

/**
 * @author GuoSurui
 */
@Mapper
public interface ReferenceMapper {
    /**
     * 根据资料名称查找
     *
     * @param referenceName 名称
     * @return 返回查到的对象
     */
    @Select(value = "SELECT * FROM reference WHERE reference.name=#{referenceName}")
    Reference findReferenceByName(@Param("referenceName") String referenceName);

    /**
     * 插入参考资料
     *
     * @param name        资料名称
     * @param author      作者
     * @param description 描述
     * @param type        资料类型（PPT/教材）
     * @param language    语言
     */
    @Insert(value = "INSERT INTO reference(name, author, description, type, language) " + "VALUES (#{name},#{author},#{description},#{type},#{language})")
    void insertReference(@Param("name") String name, @Param("author") String author, @Param("description") String description, @Param("type") String type, @Param("language") String language);
}
