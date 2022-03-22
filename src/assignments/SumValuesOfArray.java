package assignments;

public class SumValuesOfArray {

    //Write a java program to calculate sum values of an array

    public static void main(String[] args){
        int[] a={1,2,3,4,5,6,7,8,9,10};
        int sum=0;
        for(int i=0; i<=a.length; i++){
            sum+=i;

        }
        System.out.println("The sum is:" +sum);



    }
}
