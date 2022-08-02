/**
 * Shape list
 */

package com.codeismine.prototype_two.shapes;

import java.util.Objects;

/**
 * Common shape interface
 *
 * @author mengsreang_chhoeung
 */
public abstract class Shape {
    public int x;
    public int y;
    public String color;
    
    public Shape() {
    }
    
    public Shape(Shape target) {
        if (target != null) {
            this.x = target.x;
            this.y = target.y;
            this.color = target.color;
        }
    }
    
    public abstract Shape clone();

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Shape other = (Shape) obj;
        if (this.x != other.x) {
            return false;
        }
        if (this.y != other.y) {
            return false;
        }
        return Objects.equals(this.color, other.color);
    }
}
