package com.dayker.car;

public interface CarMovement {

    public void move();

    public void stop();

    public int movingWithSpeed(int speed);

    public double coveredDistance(int averageSpeed, double time);

}
