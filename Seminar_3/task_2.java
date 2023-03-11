// Пусть дан произвольный список целых чисел, удалить из него чётные числа

package Seminar_3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class task_2 {
    public static void main(String[] args) {
        Random rnd = new Random();
        int capacity = 100;
        List<Integer> listOfRandoms = new ArrayList<Integer>();
        
        for (int i = 0; i < capacity; i++){
            listOfRandoms.add(rnd.nextInt(50));
        }

        System.out.println(Arrays.toString(listOfRandoms.toArray()));
        System.out.println(listOfRandoms.size());

        for (int i = 0; i < listOfRandoms.size(); i++){
            if (listOfRandoms.get(i) % 2 == 0){
                listOfRandoms.remove(i);
                i--;
            }
        }

        System.out.println(Arrays.toString(listOfRandoms.toArray()));
        System.out.println(listOfRandoms.size());
    }
    
}
