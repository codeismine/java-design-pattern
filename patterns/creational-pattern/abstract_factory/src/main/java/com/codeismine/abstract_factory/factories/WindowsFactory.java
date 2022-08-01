package com.codeismine.abstract_factory.factories;

import com.codeismine.abstract_factory.buttons.Button;
import com.codeismine.abstract_factory.buttons.WindowsButton;
import com.codeismine.abstract_factory.checkboxes.Checkbox;
import com.codeismine.abstract_factory.checkboxes.WindowsCheckbox;

/**
 * Each concrete factory extends basic factory and responsible for creating
 * products of a single variety.
 *
 * @author mengsreang_chhoeung
 */
public class WindowsFactory implements GUIFactory {

    @Override
    public Button createButton() {
        return new WindowsButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new WindowsCheckbox();
    }
    
}
