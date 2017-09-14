package acm;

import java.util.Scanner;

/**
 * Created by ming on 2017/9/14.
 有三个整数a b c,由键盘输入，输出其中的最大的数。

 输入

 一行数组，分别为a b c

 输出

 a b c其中最大的数

 样例输入

 10 20 30
 样例输出

 30
 */
public class PID_1505 {
    public static void main(String args[]){
        Scanner scanner=new Scanner(System.in);
        String num = scanner.nextLine();
        String[] nums = num.split(" ");
        int max=0;
        for(int i=0;i<nums.length;i++){
            if(i==0){
                max= Integer.parseInt(nums[i]);
            }else{
                if(Integer.parseInt(nums[i])>max){
                    max= Integer.parseInt(nums[i]);
                }
            }
        }
        System.out.print(max);
    }
}
