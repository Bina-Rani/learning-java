package Methods;

public class exercise3 {

        //Creat a checkAge() method with an integer variable called age
        //If age is less than 18, print "Access granted"
        //If age is greater than, or equal to, 18, print "Access granted"
        //Call the checkAge method and pass along an age of 20

        static void checkAge(int age){
            if(age<18){
                System.out.println("Access denied");
            }else{
                System.out.println("access granted");
            }
        }
        public static void main(String[] args){
            checkAge(20);
        }

    }




