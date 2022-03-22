package Object;
//Creat a MyClass class

public class MyClass {
    //Creat aclass attribute x
    int x =5;
    // Use myObj to access and print the value of the x attribute of MyClass
    public static void main(String[] args){
        MyClass myObj = new MyClass();
        System.out.println(myObj.x);
    }
    //Creat a class constructor the for MyClass class
    public MyClass(){
        //Set the initial value for the class attribute x to 5
        //Creat an myObj object of class MyClass(This will call the constructor)
    }
}
