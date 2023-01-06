package Array;

public class Print_Numbers_And_Sum {
    public static void main(String[]args){
        int[]a={10,12,13,14,16};
        int sum=0;
        for(int i=0; i<a.length; i++){
          sum=sum+a[i];
        }
        System.out.println(sum);

        /*for(int b:a){
            sum=sum+b;
        }
        System.out.println(sum);*/
    }
}
