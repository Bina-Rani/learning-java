package assignments;

public class Teacher {
    String designation="Teacher";
    String CollegeName="BeginnersBook";
    void does(){
        String Teaching;
        System.out.println("Teaching");

    }
    class ComputerTeacher extends Teacher{
        String designation="Teacher";
        String CollegeName="BeginnersBook";
        void does(){
            String Teaching;
            System.out.println("Teaching is ok");

        }


    }
    public static void main(String[] args){
        Teacher th=new Teacher();
        th.does();



    }
}
