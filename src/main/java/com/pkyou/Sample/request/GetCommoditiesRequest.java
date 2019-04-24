package com.pkyou.Sample.request;

import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;

public class GetCommoditiesRequest implements Serializable {

    @ApiModelProperty("请求商品类别：-1 全部， 0 卡券类，1 日用品，2 数码家电，3 美妆配饰")
    private int category;

    @ApiModelProperty("单页数据量")
    private int pagesize;

    @ApiModelProperty("页码")
    private int pagenum;

    public int getCategory() {
        return category;
    }

    public void setCategory(int category) {
        this.category = category;
    }

    public int getPagesize() {
        return pagesize;
    }

    public void setPagesize(int pagesize) {
        this.pagesize = pagesize;
    }

    public int getPagenum() {
        return pagenum;
    }

    public void setPagenum(int pagenum) {
        this.pagenum = pagenum;
    }
}
