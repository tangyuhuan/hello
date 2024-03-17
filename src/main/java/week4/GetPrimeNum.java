package week4;
import java.util.Scanner;
//得到100以内的素数
//素数:只能被1和自己整除的数，不包括1
public class GetPrimeNum {
    public static void main(String[] args){
//        boolean isPrime = true;//是素数
        for(int i=2;i<=100;i++){
            boolean isPrime = true;
            for(int j=2;j<i;j++){
                if(i%j==0){
                    isPrime = false;
                    break;//跳出循环
                }
            }
            if(isPrime){
                System.out.println(i+"是素数");
            }
        }

    }
}
