package com.pkyou.Sample.response;

import io.swagger.annotations.ApiModelProperty;

public class GetCommodityExchangeRecordResponse {
    @ApiModelProperty("商品ID")
    private int commodityId;
    @ApiModelProperty("商品名称")
    private String commodityName;
    @ApiModelProperty("用户ID")
    private int userId;
    @ApiModelProperty("交易时间")
    private int exchangeTime;
    @ApiModelProperty("交易值")
    private int costValue;
    @ApiModelProperty("收货人姓名")
    private String consigneeName;
    @ApiModelProperty("收货人电话")
    private String consigneePhone;
    @ApiModelProperty("收货人省份")
    private String consigneePcd;
    @ApiModelProperty("收货人详细地址")
    private String consigneeDetail;

    public int getCommodityId() {
        return commodityId;
    }

    public void setCommodityId(int commodityId) {
        this.commodityId = commodityId;
    }

    public String getCommodityName() {
        return commodityName;
    }

    public void setCommodityName(String commodityName) {
        this.commodityName = commodityName;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public int getExchangeTime() {
        return exchangeTime;
    }

    public void setExchangeTime(int exchangeTime) {
        this.exchangeTime = exchangeTime;
    }

    public int getCostValue() {
        return costValue;
    }

    public void setCostValue(int costValue) {
        this.costValue = costValue;
    }

    public String getConsigneeName() {
        return consigneeName;
    }

    public void setConsigneeName(String consigneeName) {
        this.consigneeName = consigneeName;
    }

    public String getConsigneePhone() {
        return consigneePhone;
    }

    public void setConsigneePhone(String consigneePhone) {
        this.consigneePhone = consigneePhone;
    }

    public String getConsigneePcd() {
        return consigneePcd;
    }

    public void setConsigneePcd(String consigneePcd) {
        this.consigneePcd = consigneePcd;
    }

    public String getConsigneeDetail() {
        return consigneeDetail;
    }

    public void setConsigneeDetail(String consigneeDetail) {
        this.consigneeDetail = consigneeDetail;
    }
}
