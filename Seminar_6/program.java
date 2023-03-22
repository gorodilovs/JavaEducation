package Seminar_6;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class program {
    public static void main(String[] args) {
        
        Set<NoteBook> storage = new TreeSet<NoteBook>();
        NoteBook notebook1 = new NoteBook("notebook1", 10, 50, "Windows", "White");
        NoteBook notebook2 = new NoteBook("notebook2", 20, 40, "Windows", "Black");
        NoteBook notebook3 = new NoteBook("notebook3", 30, 30, "None", "Red");
        NoteBook notebook4 = new NoteBook("notebook4", 40, 20, "Apple", "Yellow");
        NoteBook notebook5 = new NoteBook("notebook5", 50, 10, "Linux", "Blue");
        
        storage.add(notebook1);
        storage.add(notebook2);
        storage.add(notebook3);
        storage.add(notebook4);
        storage.add(notebook5);

        
        Scanner userInput = new Scanner(System.in);
        String option = "";
        int value = 0;
        Boolean exit = false;
        Map<String, Integer> filter = new HashMap<>();
        Set<NoteBook> result = new TreeSet<>(storage);

        System.out.println("Hello, dear customer!\n");
        while(!exit)
        {
            System.out.println("Input mode: "
            + "\n 1 - Show notebooks \n 2 - Add filter \n 3 - Clear filter " 
            + "\n 4 - Exit\n");
            option  = userInput.nextLine();

            switch (option)
            {
                case "1":
                    for (int j = 0; j < filter.size(); j++) {
                        for (Iterator<NoteBook> iter = result.iterator(); iter.hasNext();) {
                            NoteBook note = iter.next();
                            if (filter.keySet().toArray()[j] == "RAM")
                            {
                                if (note.ram < filter.get("RAM"))
                                {
                                    iter.remove();
                                }
                            }
                            if (filter.keySet().toArray()[j] == "HardDrive")
                            {
                                if (note.hardDrive < filter.get("HardDrive"))
                                {
                                    iter.remove();
                                }
                            }
                            if (filter.keySet().toArray()[j] == "OS")
                            {
                                if (note.os == "Windows" && filter.get("OS") != 1)
                                {
                                    iter.remove();
                                }
                                if (note.os == "Apple" && filter.get("OS") != 2)
                                {
                                    iter.remove();
                                }
                                if (note.os == "Linux" && filter.get("OS") != 3)
                                {
                                    iter.remove();
                                }
                                if (note.os == "None" && filter.get("OS") != 4)
                                {
                                    iter.remove();
                                }


                            }
                            if (filter.keySet().toArray()[j] == "Color")
                            {
                                if (note.color == "White" && filter.get("Color") != 1)
                                {
                                    iter.remove();
                                }
                                if (note.color == "Black" && filter.get("Color") != 2)
                                {
                                    iter.remove();
                                }
                                if (note.color == "Yellow" && filter.get("Color") != 3)
                                {
                                    iter.remove();
                                }
                                if (note.color == "Blue" && filter.get("Color") != 4)
                                {
                                    iter.remove();
                                }
                                if (note.color == "Red" && filter.get("Color") != 5)
                                {
                                    iter.remove();
                                }
                            }                 
                        }
                    }

                    for (NoteBook note : result) {
                        System.out.println(note);
                    }
                    System.out.println();
                    break;

                case "2":
                    System.out.println("Input filter option: " 
                    + "\n 1 - RAM \n 2 - Hard Drive \n 3 - OS \n 4 - Color\n");
                    option  = userInput.nextLine();
        
                    switch (option)
                    {
                        case "1":
                            System.out.println("Input minimal RAM value: \n");
                            option  = userInput.nextLine();
                            try
                            {
                                value = Integer.parseInt(option);
                                filter.put("RAM", value);
                            }
                            catch (Exception e)
                            {
                                System.out.println("Input correct number");
                            }
                            break;
        
                        case "2":
                            System.out.println("Input minimal Hard Drive value: \n");
                            option  = userInput.nextLine();
                            try
                            {
                                value = Integer.parseInt(option);
                                filter.put("HardDrive", value);
                            }
                            catch (Exception e)
                            {
                                System.out.println("Input correct number");
                            }
                            break;
        
                        case "3":
                            System.out.println("Input OS: "
                            + "\n 1 - Windows \n 2 - Apple \n 3 - Linux \n 4 - None\n");
        
                            option  = userInput.nextLine();
                            try
                            {
                                value = Integer.parseInt(option);
                                filter.put("OS", value);
                            }
                            catch (Exception e)
                            {
                                System.out.println("Input correct number");
                            }
                            break;
        
                        case "4":
                            System.out.println("Input Color: "
                            + "\n 1 - White \n 2 - Black \n 3 - Yellow \n 4 - Blue \n 5 - Red\n");
        
                            option  = userInput.nextLine();
                            try
                            {
                                value = Integer.parseInt(option);
                                filter.put("Color", value);
                            }
                            catch (Exception e)
                            {
                                System.out.println("Input correct number\n");
                            }
                            break;
                        
                        default:
                            System.out.println("Input correct number!");    
                    }
                    break;

                case "3":
                    filter.clear();
                    result = new TreeSet<>(storage);
                    break;

                case "4":
                    exit = true;
                    break;

                default:
                    System.out.println("Input correct option!\n");
                
            }
        }
        userInput.close();
    }
}
