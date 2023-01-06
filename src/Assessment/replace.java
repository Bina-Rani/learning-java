package Assessment;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.function.UnaryOperator;

public class replace {
    //What function could you use to replace slashes for dashes in a list of dates?

    public static void main(String[] args){
        List<String> dates;
        dates = new ArrayList<String>();
        Function<String, String> replaceSlashes= (Function<String, String>) dates;
        dates.replaceAll((UnaryOperator<String>) replaceSlashes);

    }

}
