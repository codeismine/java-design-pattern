/*
 * Product feature 1
 */
package com.codeismine.builder.components;

/**
 *  Just another feature of a car.
 *
 * @author mengsreang
 */
public class Engine {
    private final double volume;
    private double mileage;
    private boolean started;
    
    public Engine(double _volume, double _mileage) {
        this.volume = _volume;
        this.mileage = _mileage;
    }
    
    public void on() {
        this.started = true;
    }
    
    public void off() {
        this.started = false;
    }
    
    public boolean isStarted() {
        return this.started;
    }
    
    public void go(double _mileage) {
        if (this.started) {
            this.mileage += _mileage;
        } else {
            System.err.println("Cannot go(), you must start engine first!");
        }
    }
    
    public double getVolume() {
        return this.volume;
    }
    
    public double getMileage() {
        return this.mileage;
    }
}
