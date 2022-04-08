package com.surui.java_course_design.model.dao.course;

import com.surui.java_course_design.model.entity.course.Reference;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.jetbrains.annotations.NotNull;

/**
 * @author GuoSurui
 */
@Mapper
public interface ReferenceMapper {
    /**
     * 插入参考资料
     *
     * @param name        资料名称
     * @param author      作者
     * @param description 描述
     * @param type        资料类型（PPT/教材）
     * @param language    语言
     */
    @Insert(value = "INSERT INTO reference(name, author, description, type, language) " +
            "VALUES (#{name},#{author},#{description},#{type},#{language})")
     void insertReference(@Param("name") String name, @Param("author") String author,
                                @Param("description") String description, @Param("type") String type,
                                @Param("language") String language);
}
