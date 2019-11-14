package com.api.vo;


import lombok.Getter;

@Getter
public enum  CodeMsg {

    SUCCESS(0,"成功"),
    INTERNAL_ERROR(500,"服务器内部错误"),
    PRODUCT_NOT_EXIST(100001,"商品不存在"),
    ORDER_CLOSED(200001,"交易已关闭"),
    LOGIN_FAIL(300001,"用户名或密码输入错误"),
    USER_EXIST(300002,"用户不存在")
    ;
    private int code;
    private String msg;
    private CodeMsg(int code,String msg){
        this.code = code;
        this.msg = msg;
    }


    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
