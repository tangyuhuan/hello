import java.util.Scanner;

//输入：一个整数
//输出：整数的位数
public class GetNumber {
    public static void main(String[] args){
        System.out.print("请输入一个整数：");
        Scanner in = new Scanner(System.in);
        int number = in.nextInt();
        int count = 0;
//        while(number>0){
//            number = number/10;
//            count ++;
//            System.out.println("number:"+number+" count:"+count);
//        }
        //do while在进入循环的时候不做检查，执行完一轮代码后再来检查循环条件是否满足，如果满足则继续下一轮循环。不满足则结束循环
        do{
            number = number/10;
            count ++;
            System.out.println("number:"+number+" count:"+count);
        }while(number>0);

        System.out.print("这是一个"+count+"位数");
    }
}
