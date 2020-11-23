package hw10;

/*
 * Extends from the Button Class
 * This class enhances the design of the Button Class
 */


import javafx.scene.control.Button;

/**
 *
 * @author Usmani
 */
public class BigButton extends Button{
    BigButton(String x ){
        this.setText(x);
        this.setStyle("-fx-font-size: 1.5em;");
    }
}
