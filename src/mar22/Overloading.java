package mar22;

public class Overloading {

    void add(int a, int b){
        System.out.println(a+b);

    }
    void add(int a, double b){//1
        System.out.println(a+b);

}
    void add(double a, int b){//2
        System.out.println(a + b);
    }
    void add(double a, double b){//3
        System.out.println(a + b);
    }
    void add(int a, int b, int c){//4
        System.out.println(a + b + c);
    }
    public static void main(String[] args){
        Overloading x=new Overloading();
        x.add(10,20);
        x.add(10,10.2);
        x.add(10.2, 12.2);
        x.add(10, 20, 30);
    }

    }