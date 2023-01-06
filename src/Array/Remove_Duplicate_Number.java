package Array;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;

public class Remove_Duplicate_Number {

    public static void main(String[]args){
        int [] a={2,1,6,4,2,5,5,6,9,8,7,5,8,8,7,9,10,20,10,30,20};
        Arrays.sort(a);
        System.out.println(Arrays.toString(a));

        HashSet<Integer>c=new HashSet<>();
        for(int i=0; i<a.length; i++){
            c.add(a[i]);
        }
        for(int n:c){
            System.out.println(n+"");
        }


    }



    }

