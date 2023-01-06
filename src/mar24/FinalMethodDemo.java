package mar24;

public class FinalMethodDemo {

    class Bike{ //
        final void run(){ // final method, so we can not override this method in child class
            System.out.println("Running");
        }
    }
    class Honda extends Bike{
        /*void run(){
            System.out.println("Started");
        }*/
    }
}
