package com.kuaixun.exception;

import com.kuaixun.Enum.ResultEnum;

public class ExceptionHandleMes extends RuntimeException{

    private static final long serialVersionUID = 1L;

    private final Integer code;

    public Integer getCode() {
        return code;
    }

    public ExceptionHandleMes(Integer code, String message) {
        super(message);
        this.code = code;
    }

    /***
     * 自定义错误类
     * @param resultEnum
     */
    public ExceptionHandleMes(ResultEnum resultEnum) {
        super(resultEnum.getMessage());
        this.code = resultEnum.getCode();
    }

}
