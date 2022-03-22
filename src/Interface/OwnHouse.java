package Interface;

public class OwnHouse implements House{
    @Override
    public void gasPermit() {
        System.out.println("A");

    }

    @Override
    public void waterPermit() {
        System.out.println("B");

    }

    @Override
    public void electricityPermit() {
        System.out.println("C");

    }

    @Override
    public void structurePermit() {
        System.out.println("D");

    }

    @Override
    public void soilTests() {
        System.out.println("F");


    }
    void carGarage(){
        System.out.println("G");

    }
    public static void main(String[] args){
        OwnHouse ref=new OwnHouse();
        ref.gasPermit();
        ref.waterPermit();
        ref.electricityPermit();
        ref.structurePermit();
        ref.soilTests();
        ref.carGarage();
    }
}
