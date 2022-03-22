package Inheritance;

public class car extends Vehicle {
    private String modelName="Mustang";
    public static void main(String[] args){
        car x= new car();
        x.honk();
        System.out.println(x.brand + "" + x.modelName);
    }
}
