package week4;

import java.util.Scanner;
//计算n的阶乘
//注意int类型占4个字节，能表达的数据范围是-2^31至2^31-1
//如果是20!会超出int的范围
public class GetFactor {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();//数字
        int factor = 1;
//        int i = 1;
//        while(i<=n)
//        {
//            factor *= i;
//            i++;
//        }
        for(int i=1;i<=n;i++){
            factor *= i;
        }
        System.out.println(factor);

    }
}
