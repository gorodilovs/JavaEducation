package Lection_3;

import java.util.ArrayList;

public class program 
{
    public static void main(String[] args) 
    {
        ArrayList listRaw1 = new ArrayList(); // objects
        ArrayList listRaw2 = new ArrayList(10); // capacity
        ArrayList listRaw3 = new ArrayList(listRaw2); // copy
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(2809);

        for(Object o : list)
        {
            System.out.println(o);
        }
    }
}