package week5;

import java.util.Scanner;
//素数方案二
//素数:只能被1和自己整除的数，不包括1
//所有的偶数都不是素数，除了2以外
//如果x是偶数（且不为2），则不是素数，否则要循环（n-3）/2+1遍，当n很大时就是n/2遍
public class GetPrimeNum {
    public static void main(String[] args) {
        boolean isPrime = true;
        Scanner in = new Scanner(System.in);
        int x = in.nextInt();//数字
        if(x ==1 || x%2 ==0 && x!=2){
            isPrime = false;
        }else{
            for(int i=3;i<x;i+=2){
                if(x%i == 0){
                    isPrime = false;
                    break;
                }
            }
        }
        System.out.println(isPrime);
    }
}
