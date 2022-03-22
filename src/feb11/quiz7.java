package feb11;

public class quiz7 {
    //print fibonacci series up to 10 terms
    public static void main(String args[]){
        int num1=1;
        int num2=1;
        System.out.println(num1);
        System.out.println(num2);
        for(int i=1; i<=8; i++){
            int num3=num1+num2;
            System.out.println(num3);
            num1=num2;
            num2=num3;


        }


    }
}
