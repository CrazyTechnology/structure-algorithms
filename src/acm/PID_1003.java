package acm;

import java.util.Scanner;

public class PID_1003 {

    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        StringBuffer sb=new StringBuffer(10);
        String s = in.nextLine();
        sb.append(s);
        while (s!=null){
            String ss = in.nextLine();
            if(!ss.equals("")) {
                sb.append(ss);
            }else{
                break;
            }
        }
        String[] split = sb.toString().split(" ");
        for(int i=0;i<split.length;i++){
            String s1 = split[i] + split[i + 1];
        }
    }
}
