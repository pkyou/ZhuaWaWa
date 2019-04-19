package com.pkyou.Sample.response;

import java.io.Serializable;

public class BannerResponse implements Serializable {
    private String url;

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}
