package com.framework.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

/**
 *
 * @author Administrator
 * @date 2018/2/7
 */
@ResponseStatus(value = HttpStatus.CONFLICT ,reason = "ResponseStatus 注解")
public class StrangeException extends Exception {
    public StrangeException(String message) {
        super(message);
    }
}
