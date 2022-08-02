package com.codeismine.prototype_two.cache;

import com.codeismine.prototype_two.shapes.Circle;
import com.codeismine.prototype_two.shapes.Rectangle;
import com.codeismine.prototype_two.shapes.Shape;
import java.util.HashMap;
import java.util.Map;

/**
 * Prototype factory
 * 
 * @author mengsreang_chhoeung
 */
public class BundleShapeCache {
    private Map<String, Shape> cache = new HashMap<>();
    
    public BundleShapeCache() {
        Circle circle = new Circle();
        circle.x = 5;
        circle.y = 7;
        circle.radius = 45;
        circle.color = "Green";
        
        Rectangle rectangle = new Rectangle();
        rectangle.x = 6;
        rectangle.y = 9;
        rectangle.width = 8;
        rectangle.height = 10;
        rectangle.color = "Blue";
        
        this.cache.put("Big green circle", circle);
        this.cache.put("Medium blue rectangle", rectangle);
    }
    
    public Shape put(String key, Shape shape) {
        this.cache.put(key, shape);
        return shape;
    }
    
    public Shape get(String key) {
        return this.cache.get(key).clone();
    }
}
