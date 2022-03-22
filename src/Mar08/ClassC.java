package Mar08;

public class ClassC extends ClassB {
    static int i=25;
    int b=20;

    public static void main(String[] args){
        ClassC ref3=new ClassC();
        ref3.methodC();





    }
    void methodC(){
        ClassC ref3=new ClassC();
        System.out.println(this.i);
        System.out.println(super.i);
        System.out.println(this.b);
        System.out.println(super.b);



    }
}
