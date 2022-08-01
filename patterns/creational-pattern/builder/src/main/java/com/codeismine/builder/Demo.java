/**
 * Client code
 */

package com.codeismine.builder;

import com.codeismine.builder.builders.CarBuilder;
import com.codeismine.builder.builders.CarManualBuilder;
import com.codeismine.builder.director.Director;
import com.codeismine.builder.cars.*;

/**
 * Demo class. Everything comes together here.
 *
 * @author mengsreang_chhoeung
 */
public class Demo {

    public static void main(String[] args) {
        Director director = new Director();
        
        // Director gets the concrete builder object from the client
        // (application code). That's because application knows better which
        // builder to use to get a specific product.
        CarBuilder builder = new CarBuilder();
        director.constructorSportsCar(builder);
        
        // The final product is often retrieved from a builder object, since
        // Director is not aware and not dependent on concrete builders and
        // products.
        Car car = builder.getResult();
        System.out.println("Car built:\n" + car.getCarType());
        
        CarManualBuilder manualBuilder = new CarManualBuilder();
        
        // Director may know several building recipes.
        director.constructorSportsCar(manualBuilder);
        Manual carManual = manualBuilder.getResult();
        System.out.println("\nCar manual built:\n" + carManual.print());
    }
}
