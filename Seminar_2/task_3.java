// К калькулятору из предыдущего дз добавить логирование.
// 1 + 3 = 4
// 4 + 3 = 7

package Seminar_2;

import java.util.Scanner;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;


public class task_3 {
    public static void main(String[] args) {
        
        // Logger
        Logger logger = Logger.getLogger(task_3.class.getName());

        // Save log to file
        try{
            String pathProject = System.getProperty("user.dir");
            String pathFile = pathProject.concat("/Seminar_2/data_task_3.txt");
            FileHandler fh = new FileHandler(pathFile);
            fh.setFormatter(new SimpleFormatter());
            logger.addHandler(fh);
        }
        catch (Exception e) {
            System.out.println(e);
        }

        logger.log(Level.INFO, "User action: ");

        Scanner userInput = new Scanner(System.in);
        System.out.println("Input number: ");
        double a = userInput.nextDouble();
        logger.log(Level.INFO, "User input first number: " + a);

        System.out.println("Input function: ");
        String s = userInput.next();
        logger.log(Level.INFO, "User input function: " + s);

        System.out.println("Input number: ");
        double b = userInput.nextDouble();
        logger.log(Level.INFO, "User input second number: " + b);

        switch(s){
            case "+":
                System.out.println("Result: " + (a + b));
                logger.log(Level.INFO, a + " + " + b + " = " + (a + b));
                break;
            case "-":
                System.out.println("Result: " + (a - b));
                logger.log(Level.INFO, a + " - " + b + " = " + (a - b));
                break;
            case "*":
                System.out.println("Result: " + (a * b));
                logger.log(Level.INFO, a + " * " + b + " = " + (a * b));
                break;
            case "/":
                System.out.println("Result: " + (a / b));
                logger.log(Level.INFO, a + " / " + b + " = " + (a / b));
                break;
            default:
                System.out.println("Input correct values!");
                logger.log(Level.INFO, "User input is incorrect!");
        }
        userInput.close();
    } 
}
