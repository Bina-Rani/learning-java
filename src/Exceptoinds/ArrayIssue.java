package Exceptoinds;

public class ArrayIssue {

    public static void main(String[] args) throws InterruptedException {

        int [] nums = {3, 16, 78, 29, 54};
        System.out.println(nums[0]);

        Thread.sleep(5000);

        System.out.println(nums[3]);
    }
}
