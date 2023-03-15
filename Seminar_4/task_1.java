// Пусть дан LinkedList с несколькими элементами. 
// Реализуйте метод(не void), который вернет “перевернутый” список.

package Seminar_4;

import java.util.Arrays;
import java.util.LinkedList;

public class task_1 {
    public static void main(String[] args) {
        Object[] toConvert = new Object[] { 1, "20", "Some string", 25, 40 };
        LinkedList<Object> lsToReverse = new LinkedList<>(Arrays.asList(toConvert));
        RevresedLinkedList(lsToReverse);
        System.out.println(lsToReverse);
    }

    public static LinkedList<Object> RevresedLinkedList(LinkedList<Object> ls) {
        System.out.println(ls.get(1));
        for (int i = 0; i < ls.size(); i++) {
            ls.add(0, ls.get(i));
            ls.remove(i + 1);
            System.out.println("Ittertation " + i + "\n" + ls);
        }
        return ls;
    }
}
