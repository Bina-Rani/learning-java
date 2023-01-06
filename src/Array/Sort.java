package Array;

import java.util.Arrays;

public class Sort {

    public static void main(String[] args){
        int[] numbers={15,25,10,60,60,54,4,8};
        Arrays.sort(numbers);

        System.out.println(Arrays.toString(numbers));
        //System.out.println("Arrays.sort(numbers)");

        System.out.println(numbers[numbers.length-2]);

    }
}
