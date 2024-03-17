package week4;

import java.util.Scanner;

//求和 1-1/2+1/3-1/4+。。。。+1/n
public class Sum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        double sum = 0.0;
        int sign = 1;
        for(int i=1;i<=n;i++,sign = -sign){
            sum += sign*1.0/i;
//            sign = -sign;
        }
        System.out.println(sum);
        System.out.printf("%.2f",sum);//四舍五入
    }
}
