package Array;

import java.util.Arrays;

public class Find_Any_Largest_Number {
    public static void main(String[] args){
        int a[]={3,5,-5,10,20,35,60,15,2};
        int b=a.length;
        Arrays.sort(a);

        System.out.println(a[b-1]);
    }
}
