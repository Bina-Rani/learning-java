package mar21;

public class StringMethod {
    public static void main(String[] args){
        String s="Welcome";

        String s1= "to java";

        System.out.println(s.length()); //length of string
        System.out.println(s.concat(s1));  //joining of string


        //trimming the string
        s="      Welcome     ";
        System.out.println("Before trimming string is:" +s);
        System.out.println("After trimming string is:" +s.trim());

        //charAt()
        s="Welcome";
        System.out.println(s.charAt(4)); //returns character based on index number, index will start from 0

        //contains()........return true

        s="Welcome";
        System.out.println(s.contains("Wel"));
        System.out.println(s.contains("wel"));
        System.out.println(s.contains("com"));

        //comparing string equals()

        s="Welcome";
        System.out.println(s.equals("Welcome"));
        System.out.println(s.equals("Wel come"));
        System.out.println(s.equals("welcome"));

        System.out.println(s.equalsIgnoreCase("welcome"));
        System.out.println(s.equalsIgnoreCase("welCome"));

        //replacing characters
        s="Welcome to Java";

        System.out.println(s.replace('o', 'i'));
        System.out.println(s.replace("Java", "Selenium"));

        //substring method

        s="Welcome";
        System.out.println(s.substring(0,4));

        //converting case

        s="WELCOME";
        System.out.println(s.toLowerCase());

        s="welcome";
        System.out.println(s.toUpperCase());


    }
}
