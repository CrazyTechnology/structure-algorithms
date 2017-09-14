package acm;

import java.util.Scanner;

/**
 题目描述

 输入两个整数，请编程求其中的较大者。

 输入

 在一行中输入用空格隔开的两个整数，例如5 9

 输出

 输出两个整数之中较大者，输出形式举例：max=9

 样例输入

 5 9
 样例输出

 max=9
 */
public class PID_1875 {
    public static void main(String args[]){
        Scanner scanner=new Scanner(System.in);
        String num = scanner.nextLine();
        String[] nums = num.split(" ");
        int max = Integer.parseInt(nums[0])>Integer.parseInt(nums[1])? Integer.parseInt(nums[0]) : Integer.parseInt(nums[1]);
        System.out.print("max="+max);
    }
}
