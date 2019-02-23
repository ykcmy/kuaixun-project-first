package com.kuaixun.handler;


import com.kuaixun.exception.ExceptionHandleMes;
import com.kuaixun.utils.ResultUtils;
import com.kuaixun.utils.ResultVO;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * 统一异常处理类
 */
@ControllerAdvice
public class ExceptionHandle {

    @ResponseBody
    @ExceptionHandler(value = ExceptionHandleMes.class)
    public ResultVO<Object> hander(ExceptionHandleMes e) {
        return ResultUtils.error(e.getCode(), e.getMessage());
    }

}
