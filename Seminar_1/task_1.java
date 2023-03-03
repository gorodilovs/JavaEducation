package Seminar_1;

import java.util.Scanner;

public class task_1 {
    public static void main(String[] args) {

        Scanner userInput = new Scanner(System.in);
        System.out.println("Input number: ");
        int number = userInput.nextInt();
        int sum = 0;
        int fact = 1;

        for (int i = 1; i <= number; i++){
            sum += i;
            fact *= i;
        }
        
        System.out.printf("Sum is: %s\n", sum);
        System.out.printf("Fact is: %s\n", fact);
        userInput.close();
    }
}
