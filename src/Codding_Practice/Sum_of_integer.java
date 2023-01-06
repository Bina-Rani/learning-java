package Codding_Practice;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Sum_of_integer {
    public static void main(String[]args){

        String s="b5an6g3la8d2e1sh4";
        Pattern p=Pattern.compile("[0-9]");
        Matcher m=p.matcher(s);
        int y=0;
        while(m.find()){
            y=y+Integer.parseInt(m.group());
        }
        System.out.println("sum of the number is " + y);


        String a="w8el1co9me4";
        Pattern c=Pattern.compile("[0-9]");
        Matcher b=c.matcher(a);
        int x=0;
        while(b.find()){
            x=x+Integer.parseInt(b.group());
        }
        System.out.println("sum of the number is " + x);
    }
}
