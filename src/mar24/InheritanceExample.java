package mar24;

class A{ //parent class
    int a;
    void display(){
        System.out.println(a);
    }
}
class B extends A{ //child class
    int b;
    void print(){
        System.out.println(b);
    }
}
class C extends B{
    int c;
    void show(){
        System.out.println(c);

    }
}

public class InheritanceExample {
    public static void main(String[] args){
       /* B bobj=new B();
        bobj.a=10;
        bobj.b=20;
        bobj.display();
        bobj.print();*/
        C cobj=new C();
        cobj.a=10;
        cobj.b=20;
        cobj.c=30;
        cobj.display();
        cobj.print();
        cobj.show();


    }
}
