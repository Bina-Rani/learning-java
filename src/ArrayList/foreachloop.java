package ArrayList;

import java.util.ArrayList;

public class foreachloop {
    public static void main(String args[]){
        ArrayList<String> cars = new ArrayList<String>();
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("Mazda");
        for (String i : cars){
            System.out.println(i);
        }

        //Print all the numbers and print the sum
        int[] n={10,12,13,14,16};
        int sum=0;

        for(int a:n){
            sum+=sum+a;
            System.out.println(sum);
        }
        for(int i=0; i<n.length; i++){
            sum=sum+n[i];
        }

        //Print all odd numbers from{5,8,9,12,13}

        int[] m={5,8,9,12,13};
        for(int x:n){
            if(x%2!=0){
                System.out.println(x);
            }
        }

    }
}
