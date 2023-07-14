package com.ascii274.solid.ls;


public class ElectricCar implements Car{
    private Engine engine;

    @Override
    public void turnOnEngine() {
        throw new AssertionError("I don't have an engine!");

    }

    @Override
    public void accelerate() {
        engine.powerOn(200);

    }
}
