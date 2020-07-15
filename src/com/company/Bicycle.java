package com.company;

public class Bicycle {
    private String name;
    private int cost;
    private int maxSpeed;

    public Bicycle(String name, int cost, int maxSpeed) {
        this.name = name;
        this.cost = cost;
        this.maxSpeed = maxSpeed;
    }

    public String getName() {
        return name;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }
}
