package com.codeismine.prototype_two.shapes;

/**
 * Another shape
 *
 * @author mengsreang_chhoeung
 */
public class Rectangle extends Shape {
    public int width;
    public int height;
    
    public Rectangle() {
    }
    
    public Rectangle(Rectangle target) {
        super(target);
        if (target != null) {
            this.width = target.width;
            this.height = target.height;
        }
    }

    @Override
    public Shape clone() {
        return new Rectangle(this);
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
        final Rectangle other = (Rectangle) obj;
        if (this.width != other.width) {
            return false;
        }
        return this.height == other.height;
    }  
}
