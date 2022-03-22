package feb11;

public class quiz4 {
    //Count the total number of digits in 67687
    public static void main(String args[]){
        int counter=1;

        for(int i=67687; i>10; i=i/10){
            counter++;
        }
        int counter1=1;
        for(int i=67687; i>10; i=i/10){
            counter1++;

        }
        System.out.println(counter);

        System.out.println(counter1);
    }
}



