/*
 * Client code
 */
package com.codeismine.abstract_factory.app;

import com.codeismine.abstract_factory.buttons.Button;
import com.codeismine.abstract_factory.checkboxes.Checkbox;
import com.codeismine.abstract_factory.factories.GUIFactory;

/**
 * Factory users don't care which concrete factory they use since they work with
 * factories and products through abstract interfaces.
 *
 * @author mengsreang_chhoeung
 */
public class Application {
    private Button button;
    private Checkbox checkbox;
    
    public Application(GUIFactory factory) {
        this.button = factory.createButton();
        this.checkbox = factory.createCheckbox();
    }
    
    public void paint() {
        this.button.paint();
        this.checkbox.paint();
    }
}
