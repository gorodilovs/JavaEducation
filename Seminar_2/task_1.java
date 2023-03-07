// Реализуйте алгоритм сортировки пузырьком числового массива 
// (введён вами), результат после каждой итерации запишите в лог-файл.

package Seminar_2;

import java.util.Scanner;
import java.io.PrintWriter;

public class task_1 {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        System.out.println("Input Array capacity: ");
        int capacity = userInput.nextInt();

        // int[] array = new int[] { 5, 4, 3, 2, 1 };
        int[] array = new int[capacity];
        int counter = 0;
        int temp = 0;

        // Fill array from keyboard
        for (int i = 0; i < capacity; i++){
        System.out.printf("Input Array number %s: ", i);
        array[i] = userInput.nextInt();
        }
        userInput.close();
        
        try {
            // New file
            String pathProject = System.getProperty("user.dir");
            String pathFile = pathProject.concat("/Seminar_2/data_task_1.txt");

            // Writer to file
            PrintWriter writer = new PrintWriter(pathFile, "UTF-8");

            for (int i = 0; i < array.length; i++) {
                for (int j = 0; j < array.length - counter - 1; j++) {
                    if (array[j] > array[j + 1]) {
                        temp = array[j + 1];
                        array[j + 1] = array[j];
                        array[j] = temp;
                    }
                }
                counter++;

                // Write new line after itteration
                for (int k : array) {
                    writer.print(k + " ");
                }
                writer.println();
            }

            // Write result to console
            for (int i : array) {
                System.out.print(i + " ");
            }
            System.out.println();

            writer.close();
        } 
        catch (Exception e) {
            System.out.println(e);
        }
    }
}
