/**
 * Square pegs
 */

package com.codeismine.adapter.square;

/**
 * SquarePegs are not compatible with RoundHoles (they were implemented by
 * previous development team). But we have to integrate them into our program.
 *
 * @author mengsreang_chhoeung
 */
public class SquarePeg {
    private double width;
    
    public SquarePeg(double _width) {
        this.width = _width;
    }
    
    public double getWidth() {
        return this.width;
    }
    
    public double getSquare() {
        double result;
        result = Math.pow(this.width, 2);
        return result;
    }
}
