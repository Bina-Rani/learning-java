package feb22;

public class ClassA {
    void sum(){
        System.out.println(5+6);
        ClassA a=new ClassA();
        a.multiply();

    }
    void multiply(){
        System.out.println(5*6);
    }
    public static void main(String[] args){
        ClassA ref=new ClassA();
        ref.multiply();
    }
}


