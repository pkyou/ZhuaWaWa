package com.pkyou.Sample.response;

import java.io.Serializable;

public class ExchangeIntegralResponse implements Serializable {
    private String exchangeMessage;

    public String getExchangeMessage() {
        return exchangeMessage;
    }

    public void setExchangeMessage(String exchangeMessage) {
        this.exchangeMessage = exchangeMessage;
    }
}
