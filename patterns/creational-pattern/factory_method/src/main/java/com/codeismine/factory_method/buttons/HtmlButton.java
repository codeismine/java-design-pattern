/**
 * Concrete product
 */

package com.codeismine.factory_method.buttons;

/**
 * HTML button implementation.
 *
 * @author mengsreang_chhoeung
 */
public class HtmlButton implements Button {

    @Override
    public void render() {
        System.out.println("<button>Test Button</button>");
        onClick();
    }

    @Override
    public void onClick() {
        System.out.println("Click! Button says - 'Hello World!'");
    }
    
}
