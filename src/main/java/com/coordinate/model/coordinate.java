package com.coordinate.model;

public class coordinate {
    private String argX;
    private String argY;

    public coordinate() {
    }

    public coordinate(String argX, String argY) {
        this.argX = argX;
        this.argY = argY;
    }

    public String getArgX() {
        return argX;
    }

    public void setArgX(String argX) {
        this.argX = argX;
    }

    public String getArgY() {
        return argY;
    }

    public void setArgY(String argY) {
        this.argY = argY;
    }
}
