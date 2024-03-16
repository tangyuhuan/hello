//第一周题目——温度转换
//import java.util.Scanner;
// public class Main {
//    public static void main(String[] args){
//        Scanner in = new Scanner(System.in);
//        int Ftem = in.nextInt();
//        int Ctem = (int)((Ftem - 32)*5/9);
//        System.out.println(Ctem);
//    }
//
//}

//第二周题目——时间换算
//pass
//import java.util.Scanner;
//public class Main {
//    public static void main(String[] args){
//        Scanner in = new Scanner(System.in);
//        int BJT = in.nextInt();
//        int h = (int)(BJT/100);
//        int UTC;
//        if(h>=8){
//            UTC = BJT-8*100;
//        }else{
//            UTC = BJT-8*100+2400;
//        }
//        System.out.println(UTC);
//    }
//
//}



//第二周题目——信号报告
//pass
//import java.util.Scanner;
//public class Main {
//    public static void main(String[] args){
//        Scanner in = new Scanner(System.in);
//        int number = in.nextInt();
//        String R="",S="";
//        switch(number/10){
//            case 1:
//                R="Unreadable";
//                break;
//            case 2:
//                R="Barely readable, occasional words distinguishable";
//                break;
//            case 3:
//                R="Readable with considerable difficulty";
//                break;
//            case 4:
//                R="Readable with practically no difficulty";
//                break;
//            case 5:
//                R="Perfectly readable";
//                break;
//        }
//        switch(number-number/10*10){
//            case 1:
//                S="Faint signals, barely perceptible";
//                break;
//            case 2:
//                S="Very weak signals";
//                break;
//            case 3:
//                S="Weak signals";
//                break;
//            case 4:
//                S="Fair signals";
//                break;
//            case 5:
//                S="Fairly good signals";
//                break;
//            case 6:
//                S="Good signals";
//                break;
//            case 7:
//                S="Moderately strong signals";
//                break;
//            case 8:
//                S="Strong signals";
//                break;
//            case 9:
//                S="Extremely strong signals";
//                break;
//        }
//
//        System.out.println(S+", "+(R.substring(0,1).toLowerCase()+R.substring(1))+".");
//    }
//
//}



//第三周题目——奇偶个数
//import java.util.Scanner;
// public class Main {
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
