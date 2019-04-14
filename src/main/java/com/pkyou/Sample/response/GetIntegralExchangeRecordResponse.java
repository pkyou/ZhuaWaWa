package com.pkyou.Sample.response;

/**
 * 积分交易记录返回值
 */
public class GetIntegralExchangeRecordResponse {

    private int userId;
    private int transactionSource;
    private int transactionValue;
    private int transactionTime;
    private String comment;

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

    public int getTransactionValue() {
        return transactionValue;
    }

    public void setTransactionValue(int transactionValue) {
        this.transactionValue = transactionValue;
    }

    public int getTransactionTime() {
        return transactionTime;
    }

    public void setTransactionTime(int transactionTime) {
        this.transactionTime = transactionTime;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }
}
