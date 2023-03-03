package Seminar_1;

public class task_2 {
    public static void main(String[] args) {

        boolean found = false;

        for (int i = 1; i <= 1000; i++){
            found = true;
            for (int j = 2; j < i; j++){
                if (i % j == 0){
                    found = false;
                    j = i;
                }
            }
            if (found){
                System.out.print(i + " ");
            }
        }
    }
}
