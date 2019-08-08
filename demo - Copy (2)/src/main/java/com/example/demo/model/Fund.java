package com.example.demo.model;

public class Fund {

    private String fundName,id,funDetail;
    private int rate = -1,risk;
    private int percent;


    public Fund(String id, String fundName, String funDetail, int risk, int rate, int percent) {
        this.id = id;
        this.fundName = fundName;
        this.rate = rate;
        this.percent = percent;
        this.funDetail = funDetail;
        this.risk = risk;
    }

    public void setFundName(String fundName) {
        this.fundName = fundName;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setRate(int rate) {
        this.rate = rate;
    }

    public void setPercent(int percent) {
        this.percent = percent;
    }

    public String getFundName() {
        return fundName;
    }

    public String getId() {
        return id;
    }

    public int getRate() {
        return rate;
    }

    public int getPercent() {
        return percent;
    }
    public String getFunDetail() {
        return funDetail;
    }

    public int getRisk() {
        return risk;
    }

    public void setRisk(int risk) {
        this.risk = risk;
    }
}
