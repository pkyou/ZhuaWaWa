package com.pkyou.Sample.request;

import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;

public class GetMyIntegralRequest implements Serializable {
    @ApiModelProperty("用户ID")
    private int userId;

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }
}
