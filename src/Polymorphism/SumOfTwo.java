package Polymorphism;

public class SumOfTwo {
    void sum(int a, int b){
        System.out.println(a+b);
    }
    public static void main(String[] args){
        SumOfTwo ref=new SumOfTwo();
        ref.sum(12,13);
        ref.sum(13, 13.36);
        ref.sum(25.32, 12.63);
        ref.sum(25.55, 14);
    }
    void sum(int a, double b){
        System.out.println(a+b);
    }
    void sum(double a, double b){
        System.out.println(a+b);
    }
    void sum(double a, int b){
        System.out.println(a+b);
    }
}
