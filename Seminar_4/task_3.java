// В калькулятор добавьте возможность отменить последнюю операцию.
// Дополнительно каскадная отмена - отмена нескольких операций

package Seminar_4;

import java.util.LinkedList;
import java.util.Scanner;

public class task_3 {
    public static void main(String[] args) {

        Scanner userInput = new Scanner(System.in);
        Boolean newOper = true;
        Boolean newFunc = true;
        Boolean nextFunc = true;
        Boolean correctValues = false;
        double a = 0;
        String s = "";
        double b = 0;
        double result = 0;
        int counter = 1;
        LinkedList<Object> memory = new LinkedList<>();

        while (newOper) {
            correctValues = false;
            while (!correctValues) {
                try {
                    System.out.print("Input number a: ");
                    userInput = new Scanner(System.in);
                    a = userInput.nextDouble();
                    memory.add(a);
                    correctValues = true;
                } catch (Exception e) {
                    System.out.println("Input correct number!");
                }
            }

            newFunc = true;
            while (newFunc) {
                correctValues = false;
                while (!correctValues) {
                    System.out.print("Input function: ");
                    userInput = new Scanner(System.in);
                    s = userInput.next();
                    if (s.equals("+") | s.equals("-") | s.equals("*") | s.equals("/")) {
                        memory.add(s);
                        correctValues = true;
                    } else {
                        System.out.println("Input correct function: [+] [-] [*] [/]");
                    }
                }

                correctValues = false;
                while (!correctValues) {
                    try {
                        System.out.print("Input number b: ");
                        userInput = new Scanner(System.in);
                        b = userInput.nextDouble();
                        memory.add(b);
                        correctValues = true;
                    } catch (Exception e) {
                        System.out.println("Input correct number!");
                    }
                }

                switch (s) {
                    case "+":
                        result = a + b;
                        memory.add(result);
                        break;
                    case "-":
                        result = a - b;
                        memory.add(result);
                        break;
                    case "*":
                        result = a * b;
                        memory.add(result);
                        break;
                    case "/":
                        result = a / b;
                        memory.add(result);
                        break;
                    default:
                        System.out.println("Input correct values!");
                }
                System.out.println("Result is: " + result);

                nextFunc = true;
                counter = 1;
                while (nextFunc) {
                    System.out.println(memory);
                    System.out.println("Input next option:   << New operation: W >>   << Next operation: X >>   "
                            + "<< Clear memory: C >>   << Previous value: P >>   << Quit: Q >>");
                    String nextOperation = userInput.next().toUpperCase();

                    switch (nextOperation) {
                        case "W":
                            newFunc = false;
                            nextFunc = false;
                            break;
                        case "X":
                            a = result;
                            nextFunc = false;
                            break;
                        case "C":
                            memory.clear();
                            System.out.println("Memory clear!");
                            nextFunc = false;
                            newFunc = false;
                            break;
                        case "P":
                            if (memory.size() - 3 * counter < 4) {
                                System.out.println("First known result: " + result);
                                break;
                            } else {
                                result = (double) memory.get(memory.size() - 3 * counter - 1);
                                counter++;
                                System.out.println("Previous result: " + result);
                                break;
                            }

                        case "Q":
                            newOper = false;
                            newFunc = false;
                            nextFunc = false;
                            break;
                        default:
                            System.out.println("Input correct value!");
                            break;
                    }
                }
            }
        }
        userInput.close();
    }
}
