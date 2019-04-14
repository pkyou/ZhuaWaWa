package com.pkyou.Sample.response;

public class GetCommoditiesResponse {
    private String name;
    private String detailPic;
    private String homePic;
    private int pointValue;
    private int currentStock;

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
