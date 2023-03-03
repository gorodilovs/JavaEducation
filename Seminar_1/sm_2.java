package Seminar_1;

public class sm_2 {
    public static void main(String[] args) {
        int[] arr = new int[] {1, 1, 0, 1, 1, 1};
        int n = 0;
        int max = 0;
        for(int i = 0; i < arr.length; i++){
            if (arr[i] == 1){
                n++;
            }
            else{
                n = 0;
            }
            
            if (max < n ){
                max = n;                   
            }
        }
        System.out.println(max);
    }
}
