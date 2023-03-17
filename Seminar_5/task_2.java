// // Пусть дан список сотрудников:
// "Иван Иванов"
// ,"Светлана Петрова"
// ,"Кристина Белова"
// ,"Анна Мусина"
// ,"Анна Крутова"
// ,"Иван Юрин"
// ,"Петр Лыков"
// ,"Павел Чернов"
// ,"Петр Чернышов"
// ,"Мария Федорова"
// ,"Марина Светлова"
// ,"Мария Савина"
// ,"Мария Рыкова"
// ,"Марина Лугова"
// ,"Анна Владимирова"
// ,"Иван Мечников"
// ,"Петр Петин"
// ,"Иван Ежов"

// Написать программу, которая найдет и выведет повторяющиеся
// имена с количеством повторений.
// Отсортировать по убыванию популярности Имени.

package Seminar_5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class task_2 {
    public static void main(String[] args) {
        String[] names = new String[] {
            "Иван Иванов"
            ,"Светлана Петрова"
            ,"Кристина Белова"
            ,"Анна Мусина"
            ,"Анна Крутова"
            ,"Иван Юрин"
            ,"Петр Лыков"
            ,"Павел Чернов"
            ,"Петр Чернышов"
            ,"Мария Федорова"
            ,"Марина Светлова"
            ,"Мария Савина"
            ,"Мария Рыкова"
            ,"Марина Лугова"
            ,"Анна Владимирова"
            ,"Иван Мечников"
            ,"Петр Петин"
            ,"Иван Ежов"
            }; 
        Map<String, Integer> uniqueNames = new HashMap<>();

        for (String name : names) {
            String[] splitName = name.split(" ");
            if (uniqueNames.containsKey(splitName[0]))
            {
                Integer counter = uniqueNames.get(splitName[0]) + 1;
                uniqueNames.put(splitName[0], counter);
            }
            else
            {
                uniqueNames.put(splitName[0], 1);
            }
        }
             
        System.out.println(sortByValue(uniqueNames));
    }

    public static <K, V extends Comparable<? super V>> Map<K, V> sortByValue(Map<K, V> map) {
        List<Entry<K, V>> list = new ArrayList<>(map.entrySet());
        list.sort(Collections.reverseOrder(Map.Entry.comparingByValue()));

        Map<K, V> result = new LinkedHashMap<>();
        for (Entry<K, V> entry : list) {
            result.put(entry.getKey(), entry.getValue());
        }

        return result;
    }
}



