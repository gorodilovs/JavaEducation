package Seminar_1;

import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class task_4 {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);

        // String str = "1? + 20 = 3?";
        System.out.println("Input your expression typeof xx + yy = zz: ");
        String str = userInput.nextLine();

        Scanner matched = new Scanner(str);

        List<String> numberArray = matched.findAll("[\\d+][?]|[?][\\d+]|[\\d+][\\d+]").map(m -> m.group())
                .collect(Collectors.toList());

        int[] numToReplace = new int[numberArray.size()];
        int[] indexToReplace = new int[numberArray.size()];

        if (numberArray.size() == 3) {
            for (int i = 0; i < numberArray.size(); i++) {
                if (numberArray.get(i).toString().indexOf("?") == 0) {
                    indexToReplace[i] = 10;
                    numToReplace[i] = 1 * Integer.parseInt((numberArray.get(i).toString()).replaceAll("[^0-9]", ""));
                } else if (numberArray.get(i).toString().indexOf("?") == 1) {
                    indexToReplace[i] = 1;
                    numToReplace[i] = 10 * Integer.parseInt((numberArray.get(i).toString()).replaceAll("[^0-9]", ""));
                } else {
                    indexToReplace[i] = 0;
                    numToReplace[i] = Integer.parseInt((numberArray.get(i).toString()).replaceAll("[^0-9]", ""));
                }
            }
        }

        if (numberArray.size() == 3) {
            boolean answerFound = false;
            for (int i = 1; i < 10; i++) {
                if (((numToReplace[0] + indexToReplace[0] * i) +
                        (numToReplace[1] + indexToReplace[1] * i)) == (numToReplace[2] + indexToReplace[2] * i)) {

                    System.out.println("Answer found: " + i);
                    System.out.println("Full expression is: " + ((numToReplace[0] + indexToReplace[0] * i) +
                            " + " + (numToReplace[1] + indexToReplace[1] * i)) + " = " +
                            (numToReplace[2] + indexToReplace[2] * i));
                    answerFound = true;
                }
            }
            if (!answerFound) {
                System.out.println("Answer is not found");
            }
        }
        userInput.close();
        matched.close();
    }
}
