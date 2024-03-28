package week7;

import java.util.Scanner;
import java.util.Arrays;

//题目一：分解质因数
//读入一个[2,100000]范围内的整数，输出它的质因数分解式(几个素数相乘)；当读到的就是素数时，输出它本身
//输入18
//输出18=2x3x3
//原理分析：
//        1.对 n 进行分解质因数，应先找到一个最小的质数 k，然后按下述步骤完成：
//        2.如果这个质数恰等于 n，则说明分解质因数的过程已经结束，打印出即可。
//        3.如果 n > k，且 n 能被 k 整除，则应打印出 k 的值，并用 n 除以 k 的商,作为新的正整数的 n,重复执行第一步
//        4如果 n 不能被 k 整除，则用 k+1 作为 k 的值,重复执行第一步。
public class Main {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        System.out.print(n+"=");
        int k = 2;
        while(k<=n){
            if(k==n){
                System.out.print(n);
                break;
            }else{
                if(n%k==0){
                    System.out.print(k+"x");
                    n /= k;
                }else{
                    k++;
                }
            }
        }
    }

}
//public class Main {
//    public static boolean isPrime(int num){
//        boolean isPrime = true;
//        for(int i=2;i<num;i++){
//            if(num%i==0){
//                isPrime = false;
//            }
//        }
//        return isPrime;
//    }
//    public static void getPrime(int num){
//        if(isPrime(num)){
//            System.out.print(num);
//            return;
//        }
//        int[] arr = new int[num];
//        int j = 0;
//        for(int i=2;i<num;i++){
//            if((num%i==0)&&isPrime(i)){
//                arr[j]=i;
//                j++;
//            }
//        }
//        int m = 0;
//        int n = 1;
//        System.out.print(num+"=");
//        while((arr[0]!=0)&&(num!=1)){
//            if(num%arr[m]==0){
//                num /= arr[m];
//                if(n==1){
//                    System.out.print(arr[m]);
//                    n++;
//                }else{
//                    System.out.print("x"+arr[m]);
//                }
//            }else{
//                m++;
//            }
//        }
////        System.out.println(Arrays.toString(arr));
//    }
//    public static void main(String[] args){
//        Scanner in = new Scanner(System.in);
//        getPrime(in.nextInt());
//    }
//}

//题目二：完数

//public class Main {
//    //获取所有可以整除x的正整数
//    public static boolean isPerfectNumber(int x){
//        int m = x;
//        for(int i=1;i<x;i++){
//            if(x%i==0){
////                System.out.println(i);
//                m -= i;
//                if(m==0){
//                    return true;
//                }
//            }
//        }
//        return false;
//    }
//    public static void main(String[] args){
////        System.out.print(isPerfectNumber(6));
//        Scanner in = new Scanner(System.in);
//        int n = in.nextInt();
//        int m = in.nextInt();
//        int count = 0;
//        for(int i=n;i<m;i++){
//            if(isPerfectNumber(i)){
//                if(count==0){
//                    System.out.print(i);
//                    count++;
//                }else{
//                    System.out.print(" "+i);
//                }
//
//            }
//        }
//        if(count==0){
//            System.out.println();
//        }
//
//    }
//}
