package com.pkyou.Sample.response;

public class GetCommodityExchangeRecordResponse {
    private int commodityId;
    private int userId;
    private int exchangeTime;
    private int costValue;
    private String consigneeName;
    private String consigneePhone;
    private String consigneePcd;
    private String consigneeDetail;

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
