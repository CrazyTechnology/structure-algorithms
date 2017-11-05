package algorithms;

/**
 * Created by ming on 2017/10/19.
 */
public class chapter1_1 {
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
