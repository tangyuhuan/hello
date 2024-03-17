package week4;


import java.util.Scanner;
//求数字a和b的最大公约数
//输入：12 18
//输出：6
//枚举法：缺点是计算次数多、耗时长
public class GreatestCommonDivisor {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();//数字a
        int b = in.nextInt();//数字b
        int gcd = 1;
        for(int i=2;i<=a && i<=b;i++){
            if((a%i==0)&&(b%i==0)){
                gcd = i;
            }
        }
        System.out.println("最大公约数"+gcd);

    }
}
