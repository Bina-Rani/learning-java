package feb11;

public class quiz13 {
    // Write a program to determine the cost of an automobile insurance premium, based on the number of accidents occurred by drivers.
    //The basic insurance charge is $500.
    //Number of accidents Accident Surcharge
    //     1      50
    //     2    120
    //     3    220
    //     4    370
    //     5    570
    //     6 or more No insurance

    public static void main(String args[]){
        int num=4;
        if(num==0){
            System.out.println(500);

        }else if(num==1){
            System.out.println(500+50);
        }else if(num==2){
            System.out.println(500+120);
        }else if(num==3){
            System.out.println(500+220);
        }else if(num==4){
            System.out.println(500+370);
        }else if(num==5){
            System.out.println(500+570);
        }else if(num>=6){
            System.out.println("no insurance");
        }else{
            System.out.println("wrong input");
        }
    }
}
