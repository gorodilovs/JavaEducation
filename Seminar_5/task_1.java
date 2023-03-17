// Реализуйте структуру телефонной книги с помощью HashMap, учитывая,
// что 1 человек может иметь несколько телефонов.
// Добавить функции 1) Добавление номера
// 2) Вывод всего
// Пример:
// Я ввожу: 1
// К: Введите фамилию
// Я: Иванов
// К: Введите номер
// Я: 1242353
// К: Введите 1) Добавление номера
// 2) Вывод всего
// Я ввожу: 1
// К: Введите фамилию
// Я: Иванов
// К: Введите номер
// Я: 547568
// К: Введите 1) Добавление номера
// 2) Вывод всего
// Я: 2
// Иванов: 1242353, 547568

package Seminar_5;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class task_1 {
    public static void main(String[] args) {
        Boolean loop = true;
        Scanner userInput = new Scanner(System.in);
        Integer option = 0;
        HashMap<String, List<Integer>> book = new HashMap<>();

        while (loop) {
            System.out.println("Input option: \n 1) Add number \n 2) Print all");
            option = userInput.nextInt();
            switch (option) {
                case 1:
                    System.out.println("Input name: ");
                    String name = userInput.next();
                    System.out.println("Input number: ");
                    Integer number = userInput.nextInt();

                    if (book.containsKey(name)) {
                        List<Integer> numberList = book.get(name);
                        numberList.add(number);
                        book.put(name, numberList);
                    } else {
                        List<Integer> numberList = new ArrayList<>();
                        numberList.add(number);
                        book.put(name, numberList);
                    }
                    break;

                case 2:
                    System.out.println(book);
                    break;
            }
        }
        userInput.close();
    }
}
