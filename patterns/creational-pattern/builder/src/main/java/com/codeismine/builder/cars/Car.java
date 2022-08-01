/**
 * Car product
 */

package com.codeismine.builder.cars;

import com.codeismine.builder.components.Engine;
import com.codeismine.builder.components.GPSNavigator;
import com.codeismine.builder.components.Transmission;
import com.codeismine.builder.components.TripComputer;

/**
 * Car is a product class.
 *
 * @author mengsreang_chhoeung
 */
public class Car {
    private final CarType carType;
    private final int seats;
    private final Engine engine;
    private final Transmission transmission;
    private final TripComputer tripComputer;
    private final GPSNavigator gpsNavigator;
    private double fuel = 0;
    
    public Car(CarType _carType, int _seats, 
            Engine _engine, Transmission _transmission, 
            TripComputer _tripComputer, GPSNavigator _gpsNavigator) {
        this.carType = _carType;
        this.seats = _seats;
        this.engine = _engine;
        this.transmission = _transmission;
        this.tripComputer = _tripComputer;
        this.gpsNavigator = _gpsNavigator;
    }
    
    public CarType getCarType() {
        return this.carType;
    }
    
    public double getFuel() {
        return this.fuel;
    }
    
    public void setFuel(double _fuel) {
        this.fuel = _fuel;
    }
    
    public int getSeats() {
        return this.seats;
    }
    
    public Engine getEngine() {
        return this.engine;
    }
    
    public Transmission getTransmission() {
        return this.transmission;
    }
    
    public TripComputer getTripComputer() {
        return this.tripComputer;
    }
    
    public GPSNavigator getGpsNavigator() {
        return this.gpsNavigator;
    }
}
