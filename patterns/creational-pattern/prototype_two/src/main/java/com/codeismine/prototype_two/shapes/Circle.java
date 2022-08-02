package com.codeismine.prototype_two.shapes;

/**
 * Simple shape
 * 
 * @author mengsreang_chhoeung
 */
public class Circle extends Shape {
    public int radius;
    
    public Circle() {
    }
    
    public Circle(Circle target) {
        super(target);
        if (target != null) {
            this.radius = target.radius;
        }
    }

    @Override
    public Shape clone() {
        return new Circle(this);
    }

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
        final Circle other = (Circle) obj;
        return this.radius == other.radius;
    }   
}
