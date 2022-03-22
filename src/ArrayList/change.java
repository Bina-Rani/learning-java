package ArrayList;

import java.util.ArrayList;

public class change {
    public static void main(String args[]){
        ArrayList<String> cars = new ArrayList<String>();
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("Mazda");
        cars.set(0, "Ope1");
        System.out.println(cars);

    }
}
