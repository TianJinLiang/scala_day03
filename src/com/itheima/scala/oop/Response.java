package com.itheima.scala.oop;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Response<T> {

    private String code;
    private String message;
    private T data;



    public static <T> Response<T> success(T t){
        Response<T> tResponse = new Response<>();
        tResponse.setCode("200");
        tResponse.setMessage("处理成功");
        tResponse.setData(t);
        return tResponse;
    }

    public static void main(String[] args) {
        //查询数据库
        String response = "我是查询结果";
        Response<String> tResponse = new Response<String>();
        Response<String> success = tResponse.success(response);
        System.out.println(success.toString());
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
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

    @Override
    public String toString() {
        return "Response{" +
                "code='" + code + '\'' +
                ", message='" + message + '\'' +
                ", data=" + data +
                '}';
    }
}
