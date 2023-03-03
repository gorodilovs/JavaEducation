package Seminar_1;

import java.util.Scanner;

public class task_3 {
    public static void main(String[] args) {
        
        Scanner userInput = new Scanner(System.in);
        System.out.print("Input number: ");
        double a = userInput.nextDouble();

        System.out.print("Input function: ");
        String s = userInput.next();

        System.out.print("Input number: ");
        double b = userInput.nextDouble();

        switch(s){
            case "+":
                System.err.print("Result: " + (a + b));
                break;
            case "-":
                System.err.print("Result: " + (a - b));
                break;
            case "*":
                System.err.print("Result: " + (a * b));
                break;
            case "/":
                System.err.print("Result: " + (a / b));
                break;
            default:
                System.out.print("Input correct values!");
        }

        userInput.close();
    }
}
