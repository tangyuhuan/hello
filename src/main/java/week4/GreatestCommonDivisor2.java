package week4;


import java.util.Scanner;

//求数字a和b的最大公约数
//输入：12 18
//输出：6
//辗转相除法（欧几里得法）：
//1.如果b等于0，计算结束，a就是最大公约数
//2.否则，计算a除以b的余数，让a等于b，而b等于那个余数
//3.回到第一步
public class GreatestCommonDivisor2 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();//数字a
        int b = in.nextInt();//数字b
        while(b!=0){
            int num = a%b;
            a=b;
            b=num;
        }
        System.out.println("最大公约数"+a);

    }
}
