package com.company;

import java.util.Arrays;

public class Ball {
    private int color;
    private String type;
    private int[] speedVec;

    public Ball(int color, String type, int[] speedVec) {
        this.color = color;
        this.type = type;
        this.speedVec = speedVec;
    }

    public void setColor(int color) {
        this.color = color;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setSpeedVec(int[] speedVec) {
        this.speedVec = speedVec;
    }

    @Override
    public String toString() {
        return "Ball{" +
                "color=" + color +
                ", type='" + type + '\'' +
                ", speedVec=" + Arrays.toString(speedVec) +
                '}';
    }
}
