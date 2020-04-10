package com.company;

public class Vehicle {
    private static String reg;
    private static String colour;
    private static int buildyear;

    public Vehicle(String reg, String color, int buildyear) {
        this.reg = reg;
        this.colour = color;
        this.buildyear = buildyear;
    }

    public String getReg() {
        return reg;
    }

    public String getColor() {
        return colour;
    }

    public int getBuildyear() {
        return buildyear;
    }

    public void setReg(String reg) {
        this.reg = reg;
    }

    public void setColor(String color) {
        this.colour = color;
    }

    public void setBuildyear(int buildyear) {
        this.buildyear = buildyear;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "reg='" + reg + '\'' +
                ", color='" + colour + '\'' +
                ", buildyear=" + buildyear +
                '}';
    }
}
