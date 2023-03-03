package Seminar_1;

public class sm_3 {
    public static void main(String[] args) {
        int[] array = new int[] {3, 2, 2, 3, 4, 5, 3, 3, 8, 3, 7};
        int val = 3;
        // int num = 0;
        // int temp1 = 0;
        // int temp2 = 0;
        int border = array.length;

        for (int i = 0; i < border; i++){
            if(array[i] == val){
                for (int j = i; j < array.length - 1; j++){
                    array[j] = array[j + 1];                   
                }
                i--;
                border--;
                array[array.length - 1] = val;
                for (int k : array) {
                    System.out.print(k + " ");                    
                }
                System.out.print("\n");
            }
        }

    }
}
