package arrays;
public class Practice5 {
    public static void main(String[] args) {

        int[] ages = {-12, -23, -10};
        // find the biggest age
        int largest = ages[0];
        for (int i = 1; i< ages.length; i++){


            if ( ages[i] > largest  ){

                largest = ages[i];
            }

        }
        System.out.println(largest);

    }
}
