package com.example.demo.model;

public class Fund {

    private String fundName,id;
    private int rate = -1;
    private int percent;


    public Fund(String id, String fundName, int rate, int percent) {
        this.id = id;
        this.fundName = fundName;
        this.rate = rate;
        this.percent = percent;
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
}
