package acm;

import java.util.Scanner;

/**
 * Created by ming on 2017/9/14.
 *这个问题已经解决了，只是格式问题。
 * 样例输入
 2
 www.njupt.edu.cn NUPT
 A C M
 N U P Ter

 样例输出
 www.njupt.edu.cn NUPT

 A C M

 N

 U

 P

 Ter

 */
public class PID_1012 {
    public static void main(String args[]){
        Scanner scanner=new Scanner(System.in);
        //获取行数
        int linenumber = scanner.nextInt();
        Scanner in=new Scanner(System.in);
        StringBuffer sb=new StringBuffer(10);
        String s = in.nextLine();
        sb.append(s+"|");
        while (s!=null){
            String ss = in.nextLine();
            if(!ss.equals("")) {
                sb.append(ss+"|");
            }else{
                break;
            }
        }
        String[] split = sb.toString().split("\\|");
        for(int i=0;i<split.length;i++){
            if(i<linenumber){
                System.out.println(split[i]);
                continue;
            }else{
                String[] rowformat = split[i].split(" ");
                for(int j=0;j<rowformat.length;j++)
                    System.out.println(rowformat[j]);
            }
        }
    }
    }

