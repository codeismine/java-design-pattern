package com.codeismine.singleton_native_multithreaded;

/**
 * Singleton
 *
 * @author mengsreang_chhoeung
 */
public class Singleton {
    private static Singleton instance;
    public String value;
    
    private Singleton(String _value) {
        // The following code emulates slow initialization.
        try {
            Thread.sleep(1000);
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }
        this.value = _value;
    }
    
    public static Singleton getInstance(String _value) {
        if (instance == null) {
            instance = new Singleton(_value);
        }
        return instance;
    }
}
