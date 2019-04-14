package com.pkyou.Sample.response;

import io.swagger.annotations.ApiModelProperty;

public class GetMyIntegralResponse {
    private int userId;
    @ApiModelProperty("积分值")
    private int coin;

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public int getCoin() {
        return coin;
    }

    public void setCoin(int coin) {
        this.coin = coin;
    }
}
