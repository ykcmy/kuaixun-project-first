package com.kuaixun.utils;


import com.kuaixun.Enum.ResultEnum;

/**
 * Result工具类
 */
public class ResultUtils {

    public static <T> ResultVO<T> success(T object) {
        ResultVO<T> resultVO = new ResultVO<>();
        resultVO.setData(object);
        resultVO.setCode(0);
        resultVO.setMsg("成功");
        return resultVO;
    }

    public static <T> ResultVO<T> success() {
        return success(null);
    }

    public static <T> ResultVO<T> error(Integer code, String msg) {
        ResultVO<T> resultVO = new ResultVO<>();
        resultVO.setCode(code);
        resultVO.setMsg(msg);
        return resultVO;
    }

    public static <T> ResultVO<T> error(ResultEnum resultEnum) {
        ResultVO<T> resultVO = new ResultVO<>();
        resultVO.setCode(resultEnum.getCode());
        resultVO.setMsg(resultEnum.getMessage());
        return resultVO;
    }
}
