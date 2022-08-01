/**
 * One more concrete creator
 */

package com.codeismine.factory_method.factory;

import com.codeismine.factory_method.buttons.Button;
import com.codeismine.factory_method.buttons.WindowsButton;

/**
 * Windows Dialog will produce Windows buttons.
 *
 * @author mengsreang_chhoeung
 */
public class WindowsDialog extends Dialog {

    @Override
    public Button createButton() {
        return new WindowsButton();
    }
    
}
