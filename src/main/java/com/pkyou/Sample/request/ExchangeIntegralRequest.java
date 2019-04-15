package com.pkyou.Sample.request;

import com.pkyou.Sample.Entyties.ExchangedCommodityDetail;

import java.util.List;

public class ExchangeIntegralRequest {
    private int userId;
    private List<ExchangedCommodityDetail> commodities;

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public List<ExchangedCommodityDetail> getCommodities() {
        return commodities;
    }

    public void setCommodities(List<ExchangedCommodityDetail> commodities) {
        this.commodities = commodities;
    }
}
