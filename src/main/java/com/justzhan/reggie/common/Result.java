package com.justzhan.reggie.common;

import lombok.Data;
import java.util.HashMap;
import java.util.Map;

/**
 * 通用返回结果，服务端响应的数据最终都会封装成此对象
 * @param <T>
 */
@Data
public class Result<T> {

    private Integer code; //编码：1成功，0和其它数字为失败

    private String msg; //错误信息

    private T data; //数据

    private Map map = new HashMap(); //动态数据

    public Result(Integer code, String msg, T data) {
        this.code = code;
        this.msg = msg;
        this.data = data;
    }

    public static <T> Result<T> success(T object) {
        return new Result<T>(1, null, object);
    }

    public static <T> Result<T> error(String msg) {
        return new Result<T>(0, msg, null);
    }

    public Result<T> add(String key, Object value) {
        this.map.put(key, value);
        return this;
    }

}
