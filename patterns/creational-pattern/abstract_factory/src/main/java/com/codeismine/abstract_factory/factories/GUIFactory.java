package com.codeismine.abstract_factory.factories;

import com.codeismine.abstract_factory.buttons.Button;
import com.codeismine.abstract_factory.checkboxes.Checkbox;

/**
 * Abstract factory knows about all (abstract) product types.
 *
 * @author mengsreang_chhoeung
 */
public interface GUIFactory {
    Button createButton();
    
    Checkbox createCheckbox();
}
