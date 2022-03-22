package feb22;

public class Class1 {
    void method1(){
        System.out.println("from class 1");
        Class1 b=new Class1();
        b.method1();
    }
}
