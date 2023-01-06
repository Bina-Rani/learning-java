package Array;

public class practice {
    public static void main(String args[]){
        String[] cars = {"Volvo","BMW","Ford","Mazda"};
        System.out.println(cars[0]);

        //Find out common elements in Array
        int[]a={1,2,3,4,5,6,7,8};
        int[]b={3,5,6,9,10,11,12};

        for(int i=0; i<a.length; i++){
            for(int j=0; j<b.length; j++){
                if (a[i]==b[j]){
                    System.out.println(a[i]);


                }
            }
        }

    }
}
