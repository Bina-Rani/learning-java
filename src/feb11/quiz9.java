package feb11;

public class quiz9 {
    //salary $10000
    //more than 5 years experience get 5% bonus
    //more than 10 years experience get 10% bonus
    //more than 15 years experience get 30% bonus

    public static void main(String args[]){

        int years=17;
        if(years>=5 && years<=10){
            System.out.println("10000*1.05");
        }else if(years>10 && years<=15){
            System.out.println("10000*1.10");
        }else if(years>15){
            System.out.println("10000*1.30");
        }else{
            System.out.println("no bonus");




        }
    }
}
