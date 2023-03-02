package com.xiaoren.exception;

/**
 * 系统异常处理
 */
public class SystemException extends RuntimeException{
    //状态码
    private Integer code;

    public SystemException(Integer code,String message) {
        super(message);
        this.code = code;
    }

    public SystemException(String message, Throwable cause, Integer code) {
        super(message, cause);
        this.code = code;
    }


    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }
}
