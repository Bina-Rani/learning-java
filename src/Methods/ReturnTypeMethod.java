package Methods;

public class ReturnTypeMethod {
    public static void main(String[] args){

        System.out.println(m2());
        System.out.println(m3());
        System.out.println(m4()[1]);


    }
    static void m1(){
        int a=7;

    }
    static int m2(){
        int a=5;
        return a;
    }
    static String m3(){
        String c="Name";
        return c;
    }
    static String[] m4(){
        String[] y= {"Name", "Age", "Occupation"};
        return y;
    }
}
