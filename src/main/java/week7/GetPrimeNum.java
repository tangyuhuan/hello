package week7;
import java.util.Scanner;
//对m和n之间的素数求和
//素数:只能被1和自己整除的数，不包括1
//将判断素数的部分封装成函数
public class GetPrimeNum {
    public static boolean isPrime(int i)
    {
        boolean isPrime = true;
        for(int j=2;j<i;j++){
            if(i%j==0){
                isPrime = false;
                break;//跳出循环
            }
        }
        return isPrime;
    }
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int m = in.nextInt();
        int n = in.nextInt();
        if(m==1){
            m=2;
        }
        int cnt = 0;
        int sum = 0;
        for(int i=m;i<=n;i++){
            //判断是否为素数
            if(isPrime(i)){
                cnt++;
                sum+=i;
            }
        }
        System.out.println("在"+m+"和"+n+"之间有"+cnt+"个素数，和为"+sum);

    }
}

