package com.pkyou.Sample.enums;

public enum ResponseCodeEnum {

    SUCCEED(200),
    FAILED(-1);


    private int code;

    ResponseCodeEnum(int code){
        this.code=code;
    }

    public int getCode() {
        return code;
    }
}
