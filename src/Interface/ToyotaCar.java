package Interface;

public class ToyotaCar implements Car{
    @Override
    public void moves() {
        System.out.println("moves faster upto 150 mph");
    }

    @Override
    public void stops() {
        System.out.println("stops when break is pressed");

    }

    @Override
    public void energy() {

        System.out.println("F");

    }

    @Override
    public void control() {
        System.out.println("C");

    }
    void safety(){
        System.out.println("air bags at accident detection");
    }
    void backcamera(){
        System.out.println("for convenient parking");
    }
    public static void main(String[] args){
        ToyotaCar ref=new ToyotaCar();
        ref.backcamera();
        ref.safety();
        ref.control();
        ref.energy();
        ref.stops();
        ref.moves();

    }
}
