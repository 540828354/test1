package com.mygroup.model.response;

import java.io.Serializable;

/**
 * Created by Administrator on 2018/2/5.
 */
public class Response<T> implements Serializable {

    private T content;

    private String code;

    private String message;

    public T getContent() {
        return content;
    }

    public void setContent(T content) {
        this.content = content;
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
}
