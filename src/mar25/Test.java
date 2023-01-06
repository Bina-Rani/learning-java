package mar25;

interface A{
    int a=10; //by default variables in interface are static and final
    void m1(); //by default abstract methods are public

}

public class Test implements A {
    public void m1(){
        System.out.println(a);
    }
    public static void main(String[] args){
        /*Test t=new Test();
        t.m1();*/
        A a=new Test();// we can create object reference for interface but we cannot instantiate interface
        a.m1();


    }
}
