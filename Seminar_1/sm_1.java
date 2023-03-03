package Seminar_1;

import java.util.Scanner;

public class sm_1 {
    
    public static void main(String[] args) {
        
        System.out.println("Input name: ");
        Scanner sc = new Scanner(System.in, "Cp866");
        String name = sc.nextLine();
        System.out.printf("Hello %s!", name);
        sc.close();
    }
}
