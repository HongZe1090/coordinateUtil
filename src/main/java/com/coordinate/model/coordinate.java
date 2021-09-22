package com.coordinate.model;

public class coordinate {
    private Double argX;
    private Double argY;

    public coordinate() {
    }

    public coordinate(Double argX, Double argY) {
        this.argX = argX;
        this.argY = argY;
    }

    public Double getArgX() {
        return argX;
    }

    public void setArgX(Double argX) {
        this.argX = argX;
    }

    public Double getArgY() {
        return argY;
    }

    public void setArgY(Double argY) {
        this.argY = argY;
    }
}
