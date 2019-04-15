package com.pkyou.Sample.request;

import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;

public class GetCommoditiesRequest implements Serializable {

    @ApiModelProperty("请求商品类别：-1 全部， 0 卡券类，1 日用品，2 数码家电，3 美妆配饰")
    private int category;

    public int getCategory() {
        return category;
    }

    public void setCategory(int category) {
        this.category = category;
    }
}
