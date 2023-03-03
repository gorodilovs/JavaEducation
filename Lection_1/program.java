package Lection_1;
import java.util.Scanner;

/**
 * program
 */
public class program 
{
    public static void main(String[] args) 
    {
        System.out.println("Hello Java!");

        int a = 123;
        int b = --a - a--;
        System.out.println(b);
        System.out.println(a);

        Scanner iScanner = new Scanner(System.in);
        System.out.println("name: ");
        String name = iScanner.nextLine();
        System.out.printf("Hello %s!", name);
        iScanner.close();

        for (int i = 0; i < 10; i++){
            if (i % 2 != 0){
                // GOTO i++; skip part above
                continue;
            }
            if (i == 10){
                // GO OUT from cycle
                break;
            }
            System.out.println(i);
        }
    }
    
}