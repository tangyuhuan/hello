package week4;
import java.util.Scanner;
//素数:只能被1和自己整除的数，不包括1
public class PrimeNum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();//数字
        boolean isPrime = true;//是素数
        for(int i=2;i<n;i++){
            if(n%i==0){
                isPrime = false;
                break;//跳出循环
            }
        }
        System.out.println(isPrime);
    }
}
