package mar16;
//Java program to demonstrate
//why collection frame was needed

import java.util.Hashtable;
import java.util.Vector;

public class CollectionDemo {

    public static void main(String[] args){

        //Creating instance of the array,
        //vector and hashtable

        int arr[] = new int[] {1,2,3,4};
        Vector<Integer> v =new Vector<>();
        Hashtable<Integer, String> h =new Hashtable();

        //Adding the elements into the vector
        v.addElement(1);
        v.addElement(2);

        //Adding the element into the hashtable

        h.put(1, "geeks");
        h.put(2,"4geeks");
        //Array instance creation requires [],
        //while Vector and hashtable requires (),
        //Vector element insertion requires addElement(),
        //but hashtable element insertion requires put()

        //Accessing the first element of array, vector and hashtable

        System.out.println(arr[0]);
        System.out.println(v.elementAt(0));
        System.out.println(h.get(2));

        //Array elements are accessed using []
        //vector elements using elementAt()
        //hashtable elements using get()
    }
}
