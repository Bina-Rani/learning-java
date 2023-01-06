package Array;

import java.util.HashSet;

public class Duplicate_Number {

    public static void main(String[]args){
        int[]a={1,6,2,3,4,4,5,6,7,9,7};
        HashSet<Integer>m=new HashSet<>();

        for(int i=0; i<a.length; i++){
            m.add(a[i]);
        }
        for(int n:m){
            System.out.println(n+"");
        }


    }
}
