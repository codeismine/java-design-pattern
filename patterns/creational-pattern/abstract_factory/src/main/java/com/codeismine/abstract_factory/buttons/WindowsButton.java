package com.codeismine.abstract_factory.buttons;

/**
 *All products families have the same varieties (MacOS/Windows).
 *
 * This is another variant of a button.
 * 
 * @author mengsreang_chhoeung
 */
public class WindowsButton implements Button {

    @Override
    public void paint() {
        System.out.println("You have created WindowsButton.");
    }
    
}
