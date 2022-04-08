package com.surui.java_course_design.service.impl.course;

import com.surui.java_course_design.model.dao.course.ReferenceMapper;
import com.surui.java_course_design.model.entity.course.Reference;
import org.jetbrains.annotations.NotNull;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author GuoSurui
 */
@Service
public class ReferenceImpl {
    @Resource
    private ReferenceMapper referenceMapper;

    public Reference findReferenceByName(@NotNull String referenceName) {
        return referenceMapper.findReferenceByName(referenceName);
    }

    public void insertReference(@NotNull Reference reference) {
        referenceMapper.insertReference(reference.getName(), reference.getAuthor(), reference.getDescription(),
                reference.getType(), reference.getLanguage());
    }
}
