package com.pkyou.Sample.request;

import io.swagger.annotations.ApiModelProperty;

public class GetCommodityExchangeRecordRequest {
    @ApiModelProperty("商品ID")
    private int commodityId;
    @ApiModelProperty("用户ID")
    private int userId;

    public int getCommodityId() {
        return commodityId;
    }

    public void setCommodityId(int commodityId) {
        this.commodityId = commodityId;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }
}
