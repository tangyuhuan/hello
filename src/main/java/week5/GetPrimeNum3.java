package week5;

import java.util.Scanner;

//素数方案四
//素数:只能被1和自己整除的数，不包括1
//构造前50个素数的表，若能被已知的且<x的素数整除,则不是素数
public class GetPrimeNum3 {
    public static void main(String[] args) {
        boolean isPrime = true;
        int[] primes = new int[50];
        primes[0]=2;
        int cnt =1;
        MainLoop:
        for(int i=3;cnt<50;i++){
            for(int j=0;j<cnt;j++){
                //对于每一个数，判断能否被<x的素数整除，若能整数则不是素数
                if(i%primes[j]==0){
                    continue MainLoop;
                }
            }
            //是素数，往数组中添加
            primes[cnt++]=i;
        }
        for(int i:primes){
            System.out.print(i+" ");
        }
    }
}
