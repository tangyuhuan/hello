package week5;

import java.util.Scanner;

//素数方案五
//素数:只能被1和自己整除的数，不包括1
//所有素数的倍数，一定不是素数
//构造n以内的素数表
//1.另x为2
//2.将2x、3x、4x直至ax<n的数标记为非素数
//3.另x为下一个没有被标记为非素数的数，重复2，直到所有的数都已经尝试完毕
//算法不一定和人的思维方式相同
public class GetPrimeNum4 {
    public static void main(String[] args) {
        boolean[] prime = new boolean[100];
        //数组每一位初始化为true
        for(int i=0;i<prime.length;i++){
            prime[i] = true;
        }
        for(int i=2;i<prime.length;i++){
            if(prime[i]){
                for(int j=2;i*j<prime.length;j++){
                    prime[i*j] = false;
                }
            }
        }
        for(int i=2;i<prime.length;i++){
            if(prime[i]){
                System.out.print(i+" ");
            }
        }

    }
}
