/**
 * Builder of car
 */

package com.codeismine.builder.builders;

import com.codeismine.builder.cars.CarType;
import com.codeismine.builder.components.Engine;
import com.codeismine.builder.components.GPSNavigator;
import com.codeismine.builder.components.Transmission;
import com.codeismine.builder.components.TripComputer;
import com.codeismine.builder.cars.Car;

/**
 * Concrete builders implement steps defined in the common interface.
 *
 * @author mengsreang_chhoeung
 */
public class CarBuilder implements Builder {
    private CarType type;
    private int seats;
    private Engine engine;
    private Transmission transmission;
    private TripComputer tripComputer;
    private GPSNavigator gpsNavigator;

    @Override
    public void setCarType(CarType _type) {
        this.type = _type;
    }

    @Override
    public void setSeats(int _seats) {
        this.seats = _seats;
    }

    @Override
    public void setEngine(Engine _engine) {
        this.engine = _engine;
    }

    @Override
    public void setTransmission(Transmission _transmission) {
        this.transmission = _transmission;
    }

    @Override
    public void setTripComputer(TripComputer _tripComputer) {
        this.tripComputer = _tripComputer;
    }

    @Override
    public void setGPSNavigator(GPSNavigator _gpsNavigator) {
        this.gpsNavigator = _gpsNavigator;
    }
    
    public Car getResult() {
        return new Car(this.type, this.seats, this.engine, 
                this.transmission, this.tripComputer, this.gpsNavigator);
    }
}
