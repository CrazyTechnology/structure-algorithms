package 大话数据结构.第5章_串;

/**
 * Created by limingming on 2018/5/3.
 */
public class StringUtil {
    public static void main(String args[]){

        String a="abcdefg";
        String b="abcdefh";
        System.out.println(Contains(a,b));
    }

    /**
     * 比较两个串是否相等，暴力匹配法
     * @param src
     * @param compare
     * @return
     */
    public static boolean Contains(String src,String compare){
        char[] srcChar = src.toCharArray();
        char[] compareChar = compare.toCharArray();
        int srcLength=srcChar.length;
        int compareLength=compareChar.length;
        int i=0;
        int j=0;

        return  false;
    }




    /**
     * Kmp算法
     * @param src
     * @param compare
     * @return
     */
    public static boolean kmpAgg(String src,String compare){
        char[] srcChar = src.toCharArray();
        char[] compareChar = compare.toCharArray();
        int srcLength=srcChar.length;
        int compareLength=compareChar.length;
        return  true;
    }


}
