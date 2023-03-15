// Реализуйте очередь с помощью LinkedList со следующими методами:
// enqueue() - помещает элемент в конец очереди,
// dequeue() - возвращает первый элемент из очереди и удаляет его, !!!!pollFirst()
// first() - возвращает первый элемент из очереди, не удаляя.

package Seminar_4;

import java.util.LinkedList;

public class task_2 {
    public static void main(String[] args) {
        int[] initArray = new int[] {1, 2, 3, 4, 5, 6, 7};
        LinkedList<Integer> newLinkList = new LinkedList<>();
        for (int item: initArray){
            newLinkList.add(item);
        }

        System.out.println("Original array " + newLinkList);
        enqueue(newLinkList, 8);
        System.out.println("List after enqueue()" + newLinkList);

        System.out.println("Deleted element " + dequeue(newLinkList));
        System.out.println("List after dequeue()" + newLinkList);

        System.out.println("First element is " + first(newLinkList));

    }

    public static <T> LinkedList<T> enqueue (LinkedList<T> linkList, T toAdd){
        linkList.addLast(toAdd);
        return linkList;
    }

    public static <T> Object dequeue (LinkedList<T> linkList){   
        return linkList.pollFirst();
    }

    public static <T> T first(LinkedList<T> linkList){
        return linkList.getFirst();
    } 
}
