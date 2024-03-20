package week5;

import java.util.Scanner;
//素数方案三
//素数:只能被1和自己整除的数，不包括1
//所有的偶数都不是素数，除了2以外
//无须到x-1，到sqrt(x)就够了，只要循环sqrt(x)遍，从n--->n/2---->sqrt(n)
public class GetPrimeNum2 {
    public static void main(String[] args) {
        boolean isPrime = true;
        Scanner in = new Scanner(System.in);
        int x = in.nextInt();//数字
        if(x ==1 || x%2 ==0 && x!=2){
            isPrime = false;
        }else{
            for(int i=3;i<Math.sqrt(x);i+=2){
                if(x%i == 0){
                    isPrime = false;
                    break;
                }
            }
        }
        System.out.println(isPrime);
    }
}