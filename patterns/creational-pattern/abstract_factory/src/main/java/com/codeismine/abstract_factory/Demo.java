/*
 * App configuration
 */
package com.codeismine.abstract_factory;

import com.codeismine.abstract_factory.app.Application;
import com.codeismine.abstract_factory.factories.GUIFactory;
import com.codeismine.abstract_factory.factories.MacOSFactory;
import com.codeismine.abstract_factory.factories.WindowsFactory;

/**
 * Demo class. Everything comes together here.
 *
 * @author mengsreang_chhoeung
 */
public class Demo {
    
    /**
     * Application picks the factory type and creates it in run time (usually at
     * initialization stage), depending on the configuration or environment
     * variables.
     */
    private static Application configurationApplication() {
        Application app;
        GUIFactory factory;
        String osName = System.getProperty("os.name").toLowerCase();
        if (osName.contains("mac")) {
            factory = new MacOSFactory();
            app = new Application(factory);
        } else {
            factory = new WindowsFactory();
            app = new Application(factory);
        }
        
        return app;
    }
    
    public static void main(String[] args) {
        Application app = configurationApplication();
        app.paint();
    }
    
}
