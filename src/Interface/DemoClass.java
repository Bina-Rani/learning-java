package Interface;

public class DemoClass implements FirstInterface, SecondInterface{


    @Override
    public void myMethod() {
        System.out.println("Some text");
    }

    @Override
    public void myOtherMethod() {
        System.out.println("Some other text");

    }
    public static void main(String[] args){
        DemoClass d=new DemoClass();
        d.myMethod();
        d.myOtherMethod();
    }
}
