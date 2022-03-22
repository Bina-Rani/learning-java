package assignments;

public class Student {
    int STD;
    String Sname;
    double Sub1;
    double Sub2;
    double Sub3;

    void getStuData(){ //take student details SID and Sname as parameters and assign them to variables
        STD=1020;
        Sname="John";
        System.out.println(STD);
        System.out.println(Sname);
    }
    void getStuMarks(){ // Takes student marks as parameters and assign them to Sub1, Sub2, Sub3
        Sub1=66.55;
        Sub2=87.45;
        Sub3=78.86;
        System.out.println(Sub1+Sub2+Sub3) ;// Calculate total marks and print the student details with the total marks

    }
    public static void main(String[] args){
        Student s=new Student();// Creat objects from Student class stu1, stu2. Then call student class methods
        s.getStuData();
        s.getStuMarks();
    }


}
