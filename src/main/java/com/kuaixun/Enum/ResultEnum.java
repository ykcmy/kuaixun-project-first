package com.kuaixun.Enum;

/**
 * 返回信息枚举
 */
public enum ResultEnum {
    SUCCESS(0, "成功"),

    SAVE_ERROR(1, "登陆失败!"),

    PARAM_ERROR(2, "参数错误!"),

    SMS_ERROR(3, "短信错误!"),

    SMS_TIMED_OUT_ERROR(4, "短信超时或验证码失效!"),

    SMS_VERIFY_ERROR(5, "验证码错误!"),

    EXISTED_USER(6, "该用户已存在!"),

    ORDER_GROUPOUT_ERROR(7, "xxx"),

    ORDER_USERREPEAT_ERROR(8, "xxx"),

    ORDER_TOTAL_ERROR(9, "xxx"),

    DELETE_ERROR(10, "xxx");

    private Integer code;

    private String message;

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    ResultEnum(Integer code, String message) {
        this.code = code;
        this.message = message;
    }

}
