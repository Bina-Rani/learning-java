package assignments;

public class Calculation {// Create a class 'Calculation' with 3 integer variable
    int x;
    int y;
    int z;
    Calculation(){// Create a constructor for assign the values into variables
        x=10;
        y=20;
        z=30;
    }
    Calculation(int a, int b, int c){//
        x=a;
        y=b;
        z=c;
    }
    void sum(){// Create another method sum to calculate sum of 3 numbers
        System.out.println(x+y+z);
    }
    public static void main(String[] args){
        Calculation cal=new Calculation();// Create object and call constructor by passing 3 integer values
        cal.sum();// call the sum method
    }

    }

