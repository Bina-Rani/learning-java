package mar22;

public class Constructor {

    int x;
    int y;

    Constructor(){  //Default constructor
        x=10;
        y=20;
    }
    Constructor(int a, int b){  //parameterized constructor
        x=a;
        y=b;
    }
    void display(){
        System.out.println(x+y);
    }
    public static void main(String[] args){
        Constructor c=new Constructor();// Invokes default constructor
        c.display();
        Constructor d=new Constructor(100,200);// Invokes parameterized constructor
        d.display();
    }
}
