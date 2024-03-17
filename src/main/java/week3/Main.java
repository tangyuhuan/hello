package week3;

//第三周题目——奇偶个数
//import java.util.Scanner;
// public class week4.Main {
//    public static void main(String[] args){
//        Scanner in = new Scanner(System.in);
//        int number = 0;
//        int oddNum = 0;//奇数
//        int evenNum = 0;//偶数
//        do{
//            number = in.nextInt();
//            if(number%2==1){
//                oddNum++;
//            }else if(number%2==0){
//                evenNum++;
//            }
//        }while(number!=-1);
//        System.out.println(oddNum+" "+evenNum);
//    }
//}

//第三周题目——数字特征值
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int number = in.nextInt();//数字
        int count = 0;//数位
        int oddEvenNum = 0;//数字奇偶 1-奇 0-偶
        int oddEvenCount = 0;//数位奇偶 1-奇 0-偶
        int byteNum = 0;//二进制位值
        int output = 0;
        do{
            //对一个整数%10的操作，就得到了他的个位数
            //对一个整数做/10的操作，就去掉了他的个位数
            if(number%10%2==1){
                oddEvenNum=1;
            }else{
                oddEvenNum=0;
            }
            number = number/10;
            count++;
            if(count%2==1){
                oddEvenCount=1;
            }else{
                oddEvenCount=0;
            }
            if(byteNum==0){
                byteNum=1;
            }else{
                byteNum*=2;
            }
            if(oddEvenNum==oddEvenCount){
                output+=byteNum;
            }
//            System.out.println("数字:"+number+"数位："+count+"数字奇偶"+oddEvenNum+"数位奇偶"+oddEvenCount+"二进制位值"+byteNum);
        }while(number>0);
        System.out.println(output);
    }
}
