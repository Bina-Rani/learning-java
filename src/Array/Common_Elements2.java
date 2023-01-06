package Array;

public class Common_Elements2 {
    public static void main(String[]args){
        int[]a={60,50,80,87};
        int[]b={65,50,68,88};

        for(int i=0; i<a.length; i++){
            for(int j=0; j<b.length; j++ ){
                if(a[i]==b[j]){
                    System.out.println(a[i]);
                }
            }
        }
    }

}
