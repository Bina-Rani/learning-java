package Methods;

public class exercise1 {
    //Add a fname parameter of type String to myMethod,and output "John Doe"

    static void myMethod(String fname){
        System.out.println(fname + "Doe");
    }
    public static void main(String[] args){

        myMethod("John");
    }
}
