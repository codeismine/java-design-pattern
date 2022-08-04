/**
 * Adapter of square pegs to round holes
 */
package com.codeismine.adapter.adapters;

import com.codeismine.adapter.round.RoundPeg;
import com.codeismine.adapter.square.SquarePeg;

/**
 * Adapter allows fitting square pegs into round holes.
 *
 * @author mengsreang_chhoeung
 */
public class SquarePegAdapter extends RoundPeg {
    private SquarePeg peg;

    public SquarePegAdapter(SquarePeg _peg) {
        this.peg = _peg;
    }

    @Override
    public double getRadius() {
        double result;
        // Calculate a minimum circle radius, which can fit this peg.
        result = (Math.sqrt(Math.pow((this.peg.getWidth() / 2), 2) * 2));
        return result;
    }
}
