/**
 * Round pegs
 */

package com.codeismine.adapter.round;

/**
 * RoundPegs are compatible with RoundHoles.
 *
 * @author mengsreang_chhoeung
 */
public class RoundPeg {
    private double radius;
    
    public RoundPeg() {}
    
    public RoundPeg(double _radius) {
        this.radius = _radius;
    }
    
    public double getRadius() {
        return this.radius;
    }
}
