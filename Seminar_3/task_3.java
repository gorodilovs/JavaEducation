// Задан целочисленный список ArrayList. Найти минимальное, максимальное и среднее ариф. из этого списка.


package Seminar_3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class task_3 {
    public static void main(String[] args) {
        Random rnd = new Random();
        int capacity = 10;
        List<Integer> listOfRandoms = new ArrayList<Integer>();
        int min = 0, max = 0, mean = 0;

        for (int i = 0; i < capacity; i++){
            listOfRandoms.add(rnd.nextInt(50));
        }

        System.out.println(Arrays.toString(listOfRandoms.toArray()));
        System.out.println(listOfRandoms.size());

        min = listOfRandoms.get(0);
        max = listOfRandoms.get(0);
        for (int i = 0; i < listOfRandoms.size(); i++){
            if (min < listOfRandoms.get(i))
                min = listOfRandoms.get(i);
            if (max > listOfRandoms.get(i))
                max = listOfRandoms.get(i);
            mean += listOfRandoms.get(i);          
        }
        mean = mean / listOfRandoms.size();

        System.out.println("Min " + min);
        System.out.println("Max " + max);
        System.out.println("Mean " + mean);
    }
}
