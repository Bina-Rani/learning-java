package Methods;

public class MethodParts {
    public static void main(String[] args){
        MethodParts ref= new MethodParts();
        ref.m1();
        ref.m2();
        ref.m3();
        ref.m4();

    }
    public void m1(){
        System.out.println("method m1 and public");
    }
    protected void m2(){
        System.out.println("method m2 and protected");
    }
    void m3(){
        System.out.println("method m3 and default");
    }
    private void m4(){
        System.out.println("method m4 and private");
    }

}
