package mar23;

public class StaticExample {

    static int a=10;//static variable
    int b= 20;//Non static variable

    static void m1(){//static method
        System.out.println("this is m1-static method");

    }
    void m2(){ //Non-static method
        System.out.println("this is m2-non static method");
    }
    void m3(){
        System.out.println("this m3 method....non static");
        System.out.println(a);
        System.out.println(b);
        m1();
        m2();
    }



    public static void main(String[] args){
        //static method can access only static stuff
        System.out.println(a);
        m1();
       // System.out.println(b); incorrect bcz b is non static variable
        //m2(); incorrect, bcz m2()
        //static method can alsonaccess non static stuff but through objects
        StaticExample se=new StaticExample();
        System.out.println(se.b);//non static variable through object
        se.m2(); //non static method through object
        se.m3();


    }
}
