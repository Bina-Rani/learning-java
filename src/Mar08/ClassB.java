package Mar08;

public class ClassB extends ClassA23 {
    int b=10;
    void methodB(){
        System.out.println("Method B from class B");
    }
    public static void main(String[] args){
        ClassB ref=new ClassB();
        ref.methodB();
        System.out.println(ref.b);
        ClassA23 ref1=new ClassA23();
        ref1.methodA();
        System.out.println(ref1.a);
        ref.methodA();
        System.out.println(ref.a);
        System.out.println(i);
    }
}
