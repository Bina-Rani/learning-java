package mar16;

//Java Program to Demonstrate Adding Elements
//Using addAll() method

//Importing required classes
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class GFG {
    public static void main(String[] args){
        //Creating a list
        //Declaring object of String type
        List<String> items = new ArrayList<>();

        //Adding elements to the list
        items.add("Shoes");
        items.add("Toys");

        //Add one or more elements
        Collections.addAll(items, "Fruits", "Bat", "Mouse");

        //Sorting according to reverse ordering
        Collections.sort(items, Collections.reverseOrder());

        //Printing the list contents

        for(int i=0; i<items.size(); i++){
            System.out.println(items.get(i) + "");
        }

    }
}
