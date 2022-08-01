package com.codeismine.abstract_factory.buttons;

/**
 *All products families have the same varieties (MacOS/Windows).
 *
 * This is a MacOS variant of a button.
 * 
 * @author mengsreang_chhoeung
 */
public class MacOSButton implements Button {

    @Override
    public void paint() {
        System.out.println("You have created MacOSButton.");
    }
    
}
