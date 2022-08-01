/**
 * Common builder interface
 */
package com.codeismine.builder.builders;

import com.codeismine.builder.cars.CarType;
import com.codeismine.builder.components.Engine;
import com.codeismine.builder.components.GPSNavigator;
import com.codeismine.builder.components.Transmission;
import com.codeismine.builder.components.TripComputer;

/**
 * Builder interface defines all possible ways to configure a product.
 *
 * @author mengsreang_chhoeung
 */
public interface Builder {
    void setCarType(CarType _type);

    void setSeats(int _seats);

    void setEngine(Engine _engine);

    void setTransmission(Transmission _transmission);

    void setTripComputer(TripComputer _tripComputer);

    void setGPSNavigator(GPSNavigator _gpsNavigator);
}
