/**
 * Manual product
 */

package com.codeismine.builder.cars;

import com.codeismine.builder.components.Engine;
import com.codeismine.builder.components.GPSNavigator;
import com.codeismine.builder.components.Transmission;
import com.codeismine.builder.components.TripComputer;

/**
 * Car manual is another product. Note that it does not have the same ancestor
 * as a Car. They are not related.
 *
 * @author mengsreang_chhoeung
 */
public class Manual {
    private final CarType carType;
    private final int seats;
    private final Engine engine;
    private final Transmission transmission;
    private final TripComputer tripComputer;
    private final GPSNavigator gpsNavigator;
    
     public Manual(CarType _carType, int _seats, Engine _engine, Transmission _transmission,
                  TripComputer _tripComputer, GPSNavigator _gpsNavigator) {
        this.carType = _carType;
        this.seats = _seats;
        this.engine = _engine;
        this.transmission = _transmission;
        this.tripComputer = _tripComputer;
        this.gpsNavigator = _gpsNavigator;
    }
     
     public String print() {
         String info = "";
         info += "Type of car: " + carType + "\n";
        info += "Count of seats: " + seats + "\n";
        info += "Engine: volume - " + engine.getVolume() + "; mileage - " + engine.getMileage() + "\n";
        info += "Transmission: " + transmission + "\n";
        if (this.tripComputer != null) {
            info += "Trip Computer: Functional\n";
        } else {
            info += "Trip Computer: N/A\n";
        }
        if (this.gpsNavigator != null) {
            info += "GPS Navigator: Functional\n";
        } else {
            info += "GPS Navigator: N/A\n";
        }
        return info;
     }
}
