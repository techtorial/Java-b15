package mentoring;

import java.util.Arrays;

public class SoftArray {
    public static void main(String[] args) {
        int[] array = {5, 76, 1, 90, 34, 8};
        /*
        1, 76, 5, 90, 34, 8
        1, 5, 76, 90, 34, 8
         */
        // 1, 5, 8, 34, 76, 90

        for(int i = 0; i< array.length; i++){
            for(int k = i+1; k< array.length; k++){

                if(array[k] < array[i]){
                    int tempararyK = array[k];
                    array[k] = array[i];
                    array[i] = tempararyK;
                }
            }
            System.out.println(Arrays.toString(array));
        }

    }
}
