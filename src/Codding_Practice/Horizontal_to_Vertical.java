package Codding_Practice;

public class Horizontal_to_Vertical {

    //Print out all these numbers vertically 2468
    public static void main(String[]args){

        int b=5678;
        while(b!=0){
            System.out.println(b%10);
            b=b/10;

        }
        int a=2468;
        while(a!=0){
            System.out.println(a%10);
            a=a/10;
        }
    }
}
