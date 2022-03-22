package assignments;

public class GreatestSmallest{

    //Write a program to find greatest and smallest element in an array

    public static void main(String[] args){
        int numbers[]=new int[]{55,40,34, 60, 56, 80, 77};
        int Smallest=numbers[0];
        int Greatest=numbers[0];
        for(int i=0; i<numbers.length; i++){
            if(numbers[i]>Greatest)
                Greatest=numbers[i];
            else if(numbers[i]<Smallest)
                Smallest=numbers[i];
        }
        System.out.println("Greatest Number is:" + Greatest);
        System.out.println("Smallest Number is:" + Smallest);
    }



    }

