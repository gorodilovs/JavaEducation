package Seminar_6;

public class NoteBook implements Comparable<NoteBook> {
    String name = "None";
    int ram = 0;
    int hardDrive = 0;
    String os = "None";
    String color = "None";

    public NoteBook() {
    }

    public NoteBook(String name, int ram, int hd, String os, String color) {
        this.name = name;
        this.ram = ram;
        this.hardDrive = hd;
        this.os = os;
        this.color = color;
    }

    public String toString() {
        return String.format("RAM: %d, HardDrive: %d, OS: %s, Color: %s", ram, hardDrive, os, color);
    }

    @Override
    public int compareTo(NoteBook obj) {
        return this.name.compareTo(obj.name);
    }
}
