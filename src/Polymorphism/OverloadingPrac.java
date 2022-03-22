package Polymorphism;

public class OverloadingPrac {
    public static void main(String[] args){
        OverloadingPrac ov=new OverloadingPrac();
        ov.methodA("New");
        ov.methodA(23);
        ov.methodA("little","Rock");
        ov.methodA(12,"Texas");

    }
    void methodA(){
        System.out.println("Print A");
    }
    void methodA(String a){
        System.out.println("A2"+a);
    }
    void methodA(int a){
        System.out.println("A3");
    }
    void methodA(String a, String b){
        System.out.println("A4");

    }
    void methodA(int a, String b){
        System.out.println("A5");
    }
}
