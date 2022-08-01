/**
 * Concrete creator
 */

package com.codeismine.factory_method.factory;

import com.codeismine.factory_method.buttons.Button;
import com.codeismine.factory_method.buttons.HtmlButton;

/**
 * HTML Dialog will produce HTML buttons.
 *
 * @author mengsreang_chhoeung
 */
public class HtmlDialog extends Dialog {

    @Override
    public Button createButton() {
        return new HtmlButton();
    }
    
}
