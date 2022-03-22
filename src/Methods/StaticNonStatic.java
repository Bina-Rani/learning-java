package Methods;

public class StaticNonStatic {
    public static void main(String[] args){
        m1();
        m2();
        StaticNonStatic a=new StaticNonStatic();
        a.m3();
        a.m4();
        System.out.println(j);
        System.out.println(a.i);

    }
    static void m1(){
        System.out.println("m1 static");

    }
    static void m2(){
        System.out.println("m2 static");
    }
    void m3(){
        System.out.println("m3 static");
    }
    void m4(){
        System.out.println("m4 static");
    }
    int i=14;
    static int j=25;


}
