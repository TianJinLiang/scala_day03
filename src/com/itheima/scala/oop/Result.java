package com.itheima.scala.oop;

import java.io.Serializable;

/**
 * 返回前端结果状态类
 * @Author: yuanj
 * @Date: 2018/7/25 11:04
 */
public class Result<T> implements Serializable {
    private static final long serialVersionUID = 982865324195999087L;

    private boolean success;

    private String message;

    private T data;

    public static <T> Result<T> success(T data) {
        Result<T> result = new Result<>();
        result.setSuccess(true);
        result.setMessage("处理成功");
        result.setData(data);
        return result;
    }

    public   Result<T> success2(T data) {
        Result<T> result = new Result<>();
        result.setSuccess(true);
        result.setMessage("处理成功");
        result.setData(data);
        return result;
    }

    public static Result fail(String message) {
        Result result = new Result();
        result.setSuccess(false);
        result.setMessage(message);
        return result;
    }

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

}
