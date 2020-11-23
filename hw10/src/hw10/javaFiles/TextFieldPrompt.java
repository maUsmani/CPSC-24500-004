package hw10;

/*
 * Extends from the TextFiled Class
 * This class enhances the design of the TextFiled Class
 * It creates a new constructor which create a PromptText
 */

import javafx.scene.control.TextField;

/**
 *
 * @author Usmani
 */
public class TextFieldPrompt extends TextField{
    
    TextFieldPrompt(String x){
        this.setPromptText(x);
        this.setStyle("-fx-font-size: 16px;");
        this.setMinHeight(35);
        this.setMinWidth(200);
    }
}
