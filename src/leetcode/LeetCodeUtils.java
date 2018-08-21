package leetcode;

import org.junit.Test;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class LeetCodeUtils {

    //第1题第1种解法,时间复杂度为o(n^2)
    @Test
    public void twoSums(){
        int [] nums =new int[]{2,7,11,15};
         int target=18;
         int index[]=new int[2];
         for(int i=0;i<nums.length;i++){
             for(int j=i+1;j<nums.length;j++){
                 if(target==nums[i]+nums[j]){
                     index=new int []{i,j};
                 };
             }

         }

    }
    //第1题第2中解法，借助hashmap,时间复杂度为o(n)
    @Test
    public void twoSums_2(){
        int [] nums =new int[]{2,7,11,15};
        int target=18;
        int index[]=new int[2];
        Map <Integer,Integer>map=new HashMap();
        for(int i=0;i<nums.length;i++){
            int complement = target - nums[i];
            if (map.containsKey(complement)){
                index= new int[] { map.get(complement), i };
            }
            else{
                map.put(nums[i],i);
            }
        }


    }

    @Test
    public void isPalindrome(){
        int x=12321;
        String a="12321";
        char[] chars = a.toCharArray();
        Stack stack=new Stack();
        for (int i=0;i<chars.length;i++)
            stack.push(chars[i]);
        String b="";
        while (!stack.empty()){
            b=b+stack.pop();
        }
        System.out.println(a.equals(b));


    }





}
