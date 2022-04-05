package com.surui.java_course_design.utils;

import lombok.Getter;
import lombok.Setter;

/**
 * @author GuoSurui
 */
@Setter
@Getter
public class JsonResponse<T> {
    private T data;
    private String code;
    private String msg;

    /**
     * 若没有数据返回，默认状态码为0，提示信息为：操作成功！
     */
    public JsonResponse() {
        this.code = "0";
        this.msg = "操作成功！";
    }

    /**
     * 若没有数据返回，可以人为指定状态码和提示信息
     * @param code code.
     * @param msg message.
     */
    public JsonResponse(String code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    /**
     * 有数据返回时，状态码为0，默认提示信息为：操作成功！
     * @param data data.
     */
    public JsonResponse(T data) {
        this.data = data;
        this.code = "0";
        this.msg = "操作成功！";
    }

    /**
     * 有数据返回，状态码为0，人为指定提示信息
     * @param data data.
     * @param msg message.
     */
    public JsonResponse(T data, String msg) {
        this.data = data;
        this.code = "0";
        this.msg = msg;
    }
}
