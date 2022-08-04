/**
 * Round holes
 */

package com.codeismine.adapter.round;

/**
 * RoundHoles are compatible with RoundPegs.
 *
 * @author USER
 */
public class RoundHole {
    private double radius;
    
    public RoundHole(double _radius) {
        this.radius = _radius;
    }
    
    public double getRadius() {
        return this.radius;
    }
    
    public boolean fits(RoundPeg peg) {
        boolean result;
        result = (this.getRadius() >= peg.getRadius());
        return result;
    }
}
