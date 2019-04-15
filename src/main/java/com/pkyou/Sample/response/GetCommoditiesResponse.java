package com.pkyou.Sample.response;

import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;

public class GetCommoditiesResponse implements Serializable {
    @ApiModelProperty("商品ID")
    private int id;
    @ApiModelProperty("商品名称")
    private String name;
    @ApiModelProperty("详情图")
    private String detailPic;
    @ApiModelProperty("首页图")
    private String homePic;
    @ApiModelProperty("积分值")
    private int pointValue;
    @ApiModelProperty("当前库存")
    private int currentStock;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDetailPic() {
        return detailPic;
    }

    public void setDetailPic(String detailPic) {
        this.detailPic = detailPic;
    }

    public String getHomePic() {
        return homePic;
    }

    public void setHomePic(String homePic) {
        this.homePic = homePic;
    }

    public int getPointValue() {
        return pointValue;
    }

    public void setPointValue(int pointValue) {
        this.pointValue = pointValue;
    }

    public int getCurrentStock() {
        return currentStock;
    }

    public void setCurrentStock(int currentStock) {
        this.currentStock = currentStock;
    }
}
