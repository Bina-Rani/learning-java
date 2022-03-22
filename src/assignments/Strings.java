package assignments;

import java.util.Locale;

public class Strings {

    //Write a java program to compare two strings, ignoring case differences

    public static void main(String[] args){
        String s1="Welcome";
        String s2="Home";

        System.out.println(s1.compareToIgnoreCase(s2));

        //Write a java program to concatenate a given string to the end of another string

        System.out.println(s1.concat(s2));

        //Write a java program to get the length of a given string

        System.out.println(s1.length());

        //Write a java program to get a substring of a given string between two specified positions

        System.out.println(s1.substring(0, 4));

        //Write a java program to convert all the characters in a string to uppercase

        System.out.println(s1.toUpperCase(Locale.ROOT));

        //Write a java program to convert all the characters in a string to lowercase

        System.out.println(s2.toLowerCase(Locale.ROOT));



    }
}
