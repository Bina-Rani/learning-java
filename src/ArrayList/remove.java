package ArrayList;

import java.util.ArrayList;

public class remove {
    public static void main(String args[]){
        ArrayList<String> cars = new ArrayList<String>();
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("Mazda");
        cars.remove(0);
        System.out.println(cars);

    }
}
