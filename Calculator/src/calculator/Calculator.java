/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculator;

import java.util.Scanner;

/**
 *
 * @author Jelena Mitrović
 */
public class Calculator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        Scanner scString = new Scanner(System.in);
        Scanner scNumber = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        double number1 = sc.nextDouble();
        System.out.print("Enter the second number: ");
        double number2 = sc.nextDouble();
        
        System.out.print("Enter a operation: (+,-,*,/): ");
        
        String operacija = scString.nextLine();
        
        switch (operacija) {
            case "+":
                System.out.println("Sum is: "+(number1+number2));
                break;
            case "-":
                System.out.println("Difference is: "+(number1-number2));
                break;
            case "*":
                System.out.println("Multiplied is: "+(number1*number2));
                break;
            case "/":
                if(number2==0) {
                    System.out.println("Zero division is not allowed!");
                } else {
                    System.out.println("Quotient is: "+(number1/number2));
                }
                break;
            default:
                System.out.println("Non exestnt operation!");
                break;
        }
    }
    
}

      
    
    

        
    
    

