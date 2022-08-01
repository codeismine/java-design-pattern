package com.codeismine.abstract_factory.factories;

import com.codeismine.abstract_factory.buttons.Button;
import com.codeismine.abstract_factory.buttons.MacOSButton;
import com.codeismine.abstract_factory.checkboxes.Checkbox;
import com.codeismine.abstract_factory.checkboxes.MacOSCheckbox;

/**
 * Each concrete factory extends basic factory and responsible for creating
 * products of a single variety.
 *
 * @author mengsreang_chhoeung
 */
public class MacOSFactory implements GUIFactory {

    @Override
    public Button createButton() {
        return new MacOSButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new MacOSCheckbox();
    }
    
}
