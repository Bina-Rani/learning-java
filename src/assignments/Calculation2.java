package assignments;

public class Calculation2 {

    int sum(int x,int y){
        return(x+y);
    }
    int sum(int x, int y, int z){
        return(x+y+z);
    }
    double sum(double x, double y){
        return(x+y);
    }
    double sum(double x, double y, double z){
        return(x+y+z);
    }
    public static void main(String[] args){
        Calculation2 cal=new Calculation2();
        int a=cal.sum(4,5);
        System.out.println(a);
        int b=cal.sum(4, 5, 6);
        System.out.println(b);
        double c=cal.sum(5.5, 6.5);
        System.out.println(c);
        double d=cal.sum(5.5, 6.5, 7.5);
        System.out.println(d);
    }
}
