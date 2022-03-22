package Parameter;

public class ReturnTypePractice {
    public static void main(String[] args){
        ReturnTypePractice ref= new ReturnTypePractice();
        ref.sum(5, 7);
        String z=ref.printName();

        int x=ref.sum1(2, 4);
        System.out.println(x);

    }
    void sum(int a, int b){
        int c=a+b;
        System.out.println(c);
    }
    int sum1(int a, int b){
        int c=a+b;
        return c;

    }
   String printName(){
        String name="Arko";
        return name;
   }
//
//    }
    
}
