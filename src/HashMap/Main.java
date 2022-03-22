package HashMap;

import java.util.HashMap;

public class Main {
    public static void main(String[] args){
        HashMap<String, String> CapitalCities=new HashMap<String, String>();

        CapitalCities.put("England", "London");
        CapitalCities.put("Germany", "Berlin");
        CapitalCities.put("Norway", "Oslo");
        CapitalCities.put("USA", "Wasington DC");
        System.out.println(CapitalCities);

    }
}
