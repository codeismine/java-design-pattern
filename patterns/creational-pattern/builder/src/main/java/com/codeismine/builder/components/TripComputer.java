/**
 * Product feature 4
 */

package com.codeismine.builder.components;

import com.codeismine.builder.cars.Car;

/**
 * Just another feature of a car.
 *
 * @author mengsreang_chhoeung
 */
public class TripComputer {
    private Car car;
    
    public void setCar(Car _car) {
        this.car = _car;
    }
    
    public void showFuelLevel() {
        System.out.println("Fuel level: " + this.car.getFuel());
    }
    
    public void showStatus() {
        if (this.car.getEngine().isStarted()) {
            System.out.println("Car is started");
        } else {
            System.out.println("Car isn't started");
        }
    }
}
