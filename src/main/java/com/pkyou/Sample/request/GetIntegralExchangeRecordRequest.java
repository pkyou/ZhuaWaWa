package com.pkyou.Sample.request;

import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;

public class GetIntegralExchangeRecordRequest implements Serializable {
    @ApiModelProperty(value="用户ID",required=true)
    private int userId;
    @ApiModelProperty(value="交易来源 0 收入 或者 1 消费",required=true)
    private int transactionSource;
    /**
     *
     */
    private int valueType;

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public int getTransactionSource() {
        return transactionSource;
    }

    public void setTransactionSource(int transactionSource) {
        this.transactionSource = transactionSource;
    }

    public int getValueType() {
        return valueType;
    }

    public void setValueType(int valueType) {
        this.valueType = valueType;
    }
}
