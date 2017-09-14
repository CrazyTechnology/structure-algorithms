package acm;

import java.util.Scanner;

/**
 * Created by ming on 2017/9/14.
 * 有三个整数a b c,由键盘输入，输出其中的最大的数。
 */
public class PID_3046 {
    public static void main(String args[]){
        Scanner scanner=new Scanner(System.in);
        String num = scanner.nextLine();
        String[] nums = num.split(" ");
        for(int i=nums.length-1;i>=0;i--){
            System.out.print(nums[i]+" ");
        }

    }
}
