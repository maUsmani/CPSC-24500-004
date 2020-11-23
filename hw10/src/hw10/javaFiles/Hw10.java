/*
 * Ammar Irfan 
 * 11/08/2020
 * This program is a practise of GUI using HW9
 * The user will enter the information using GUI elements and saved into the class
 */
package hw10;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextArea;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

/**
 *
 * @author Usmani
 */
public class Hw10 extends Application {
    
    @Override
     public void start(Stage primaryStage) {
        
        //Controls DECLARATION
        ToggleGroup loanTypeOptionsTG = new ToggleGroup();                  //for Radio button 
        ToggleGroup loanYearOptionsTG = new ToggleGroup();                  //for Radio button 
        
        BigButton addLoanBTN = new BigButton("  Add the Loan  ");           //action button
        TextFieldPrompt aprTF = new TextFieldPrompt("APR %");               //TextField for APR                            
        RadioButton loanTypeRBTN1 = new RadioButton("Personal");            //RadioButton for LoanType
        loanTypeRBTN1.setUserData("1");
        RadioButton loanTypeRBTN2 = new RadioButton("Business");            //RadioButton for LoanType
        loanTypeRBTN2.setUserData("2");
        TextFieldPrompt loanAmtTF = new TextFieldPrompt("Amount of Loan");  //TextField for LoanTotalAmt    
        TextFieldPrompt loanNoTF = new TextFieldPrompt("Loan Number");      //TextField for LoanNumber    
        TextFieldPrompt lastNameTF = new TextFieldPrompt("Last Name");      //TextField for lastName     
        RadioButton loanYearRBTN1 = new RadioButton("1"); 
        loanYearRBTN1.setUserData("1");
        RadioButton loanYearRBTN2 = new RadioButton("3");
        loanYearRBTN2.setUserData("3");
        RadioButton loanYearRBTN3 = new RadioButton("5");
        loanYearRBTN3.setUserData("5");
        TextArea textArea = new TextArea("Output Area");
        textArea.setScaleShape(true);
        textArea.setWrapText(true);
        textArea.setEditable(false);
        
        //Toggeling the RadioButtons
        loanTypeRBTN1.setToggleGroup(loanTypeOptionsTG);
        loanTypeRBTN2.setToggleGroup(loanTypeOptionsTG);
        loanYearRBTN1.setToggleGroup(loanYearOptionsTG);
        loanYearRBTN2.setToggleGroup(loanYearOptionsTG);
        loanYearRBTN3.setToggleGroup(loanYearOptionsTG);
        
        //Panes and Layout
        loanTypeRBTN2.setToggleGroup(loanTypeOptionsTG);        
        HBox topHBox = new HBox(aprTF, loanTypeRBTN1, loanTypeRBTN2);
        HBox middleHBox = new HBox(loanAmtTF, loanNoTF, lastNameTF);
        HBox bottomHBox = new HBox(loanYearRBTN1,loanYearRBTN2,loanYearRBTN3, addLoanBTN);
        bottomHBox.setSpacing(25);
        middleHBox.setSpacing(10);
        topHBox.setSpacing(10);
        VBox root = new VBox(topHBox,middleHBox, bottomHBox, textArea);
        topHBox.setSpacing(10);
        root.setPadding(new Insets(5, 5, 5, 5));
        root.setSpacing(5);
        
        Scene scene = new Scene(root);
        primaryStage.setTitle("Create A Loan");
        primaryStage.setScene(scene);
        primaryStage.show();
        
        
        /*@param
        on the click, capture all the information from each field
        and create a class accordingly
        */
        addLoanBTN.setOnAction((ActionEvent e) -> {
            double apr = Double.parseDouble(aprTF.getText()),
                   amtOfLoan = Double.parseDouble(loanAmtTF.getText());
            int loanType = Integer.parseInt(loanTypeOptionsTG.getSelectedToggle().getUserData().toString()),
                loanNumber = Integer.parseInt(loanNoTF.getText()), 
                loanTerm = Integer.parseInt(loanYearOptionsTG.getSelectedToggle().getUserData().toString());
            String lastName = lastNameTF.getText();
            
            switch(loanType){
                case 1:
                    PersonalLoan myPLoan = new PersonalLoan (loanNumber, lastName, amtOfLoan, loanTerm);
                    myPLoan.setApr(apr);
                    textArea.setText(myPLoan.toString());
                    break;
                case 2:
                    BusinessLoan myBLoan = new BusinessLoan (loanNumber, lastName, amtOfLoan, loanTerm);
                    myBLoan.setApr(apr);
                    textArea.setText(myBLoan.toString());
                    break;
                default:
                    System.out.println("Wrong Loan Type");                
            }
            
                
        });
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
