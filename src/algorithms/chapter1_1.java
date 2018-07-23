package algorithms;

import org.junit.Test;

/**
 * Created by ming on 2017/10/19.
 */
public class chapter1_1 {



    @Test
    //1.1.1
    public void test_1_1_1(){
        int a= (0+15)/2;  //7
        int b= (0+15)/2;  //7.0
        boolean boo = true && false || true && true;  //true
        System.out.print(boo);
    }

    @Test
    //1.1.2
    public void test_1_1_2(){
        double dou = (1 + 2.236) / 2; //double 类型 1.618
        double v = 1 + 2 + 3 + 4.0;   //double 类型  10.0
        boolean b = 4.1 >= 4;       //  boolean 类型 true
        String s = 1 + 2 + "3";     //  string  33
        System.out.print(s);
    }

    @Test
    //1.1.3
    public void test_1_1_3(){
        int a=0,b=1,c=0;
        if(a==b&&b==c){
            System.out.println("相等");
        }else{
            System.out.println("不想等");
        }
    }


    @Test
    //1.1.4
    public void test_1_1_4(){
        int a=0,b=0,c;
        //  if(a>b) then c=0;  不识别then
        //if a>b{c=0} 没有括号
    }

    @Test
    //1.1.5
    public void test_1_1_5(){
        double x=0.1,y=0.8;
        if(x<1&&x>0&&y>0&&y<1){
            System.out.println("ok");
        }else {
            System.out.println("no");
        }
    }

    @Test
    //1.1.6
    public void test_1_1_6(){
        int f=0;
        int g=1;
        for(int i=0;i<=15;i++){
            System.out.println(f);//0 1 1 2 3 5 8 13 21 34 55 89 144 233 377 610  斐波那契数列
            f=f+g;
            g=f-g;
        }
    }

    @Test
    //1.1.7
    public void test_1_1_7(){
        double t=9.0;
        while (Math.abs(t-9.0/t)>.001){
            t=(9.0/t + t)/2.0;
        }
        System.out.println(t);

        int sum=0;
        for(int i=1;i<1000;i++){
            for(int j=0;j<1000;j++){
                sum++;
            }
        }
        System.out.println(sum);

        sum=0;
        for(int i=1;i<1000;i*=2){
            for(int j=0;j<1000;j++){
                sum++;
            }
        }
        System.out.println(sum);

    }

    @Test
    //1.1.8
    public void test_1_1_8(){
        System.out.println('b'); //b
        System.out.println('b'+'c'); //197
        System.out.println((char)('a'+4)); //e
    }

    @Test
    //1.1.9
    public void test_1_1_9(){
        String s = Integer.toBinaryString(50);
        System.out.println(s);

        int a=50;
        String p="";
        while (a/2!=0){
            //除以2，取余数然后反转
            p=a%2+p;
            a=a/2;
        }
        p=a%2+p;
        System.out.println(p);

    }

    @Test
    //1.1.10
    public void test_1_1_10(){
//        int a[];
//        for(int i=0;i<10;i++){
//            a[i]=i*i;
//        }
        //以上代码 a[]没有被初始化
    }

    @Test
    //1.1.11
    public void test_1_1_11(){

    }



    public static int[] swap(int arry[]){
        int i=0,j=arry.length-1;
        int temp;
        while (i<j){
            if(arry[j]%2==0){
                j--;
                continue;
            }
            if(arry[i]%2==1){
                i++;
                continue;
            }
            temp=arry[j];
            arry[j]=arry[i];
            arry[i]=temp;
            i++;
            j--;
        }
        return arry;
    }

    public static void main(String args[]){

        //1.1.1 System.out.println((0+15)/2);
        //System.out.println(0.000002*100000000.1);
        // 1.1.2       System.out.println((1+2.236)/2);
        //        System.out.println(1 + 2 + 3 + 4.0);
        //        System.out.println(4.1>=4);
        //       System.out.println(1+2+"3"); 33
        //1.1.3equals(10,10,10);
        //print();
        // System.out.print('b'+'c');
        // System.out.print((char)('a'+4));

//        for(int i=2;i<100;i++){
//            System.out.println(i+"  "+isPrime(i));
//        }
        //System.out.print(sqrt(9.0));
        // sum();
        int array[]=new int[10];
        array[0]=8;
        array[1]=1;
        array[2]=2;
        array[3]=3;
        array[4]=4;
        array[5]=5;
        array[6]=6;
        array[7]=7;
        array[8]=9;
        array[9]=10;
        array=swap(array);
        for(int i=0;i<array.length-1;i++){
            System.out.println(array[i]);
        }
    }




    public static void sum(){
        int sum=0;
        for(int i=1;i<1000;i*=2)
            for(int j=0;j<1000;j++)
                sum++;
        System.out.print(sum);
    }


    public static Double sqrt(double c){
        if(c<0) return null;
        double err=0.001;
        double t=c;
        while (Math.abs(t-c/t)>err*t)
            t=(c/t+t)/2.0;
        return t;
    }

    public static boolean isPrime(int N){
        if(N<2) return false;
        for(int i=2;i*i<=N;i++)
            if(N%i==0) return false;
        return true;
    }




    //1.1.3 判断3个数是否都相等
    public static String equals(int a, int b,int c){
        if(a==b&&b==c)
            return "equal";
        return "not equal";
    }

    //1.1.5
    public static String isDouble(double x,double y){
        if(x>0&&x<1&&y>0&&y<1){
            return "true";
        }else{
            return "false";
        }
    }

    public static void print(){
        int f=0;
        int g=1;
        for(int i=0;i<=15;i++){
            System.out.println(f);
            f=f+g;
            g=f-g;
        }
    }
}
