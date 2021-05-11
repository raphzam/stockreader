package com.example.stockreader.models;

public class StockData {

    private double open;
    private double high;
    private double low;
    private double close;
    private double volume;
    private double adjClose;

    public StockData() {
    }

    public StockData(double open, double high, double low, double close, double volume, double adjClose) {
        this.open = open;
        this.high = high;
        this.low = low;
        this.close = close;
        this.volume = volume;
        this.adjClose = adjClose;
    }

    public double getOpen() {
        return open;
    }

    public void setOpen(double open) {
        this.open = open;
    }

    public double getHigh() {
        return high;
    }

    public void setHigh(double high) {
        this.high = high;
    }

    public double getLow() {
        return low;
    }

    public void setLow(double low) {
        this.low = low;
    }

    public double getClose() {
        return close;
    }

    public void setClose(double close) {
        this.close = close;
    }

    public double getVolume() {
        return volume;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }

    public double getAdjClose() {
        return adjClose;
    }

    @Override
    public String toString() {
        return "StockData{" +
                "open=" + open +
                ", high=" + high +
                ", low=" + low +
                ", close=" + close +
                ", volume=" + volume +
                ", adjClose=" + adjClose +
                '}';
    }

    public void setAdjClose(double adjClose) {
        this.adjClose = adjClose;
    }
}
