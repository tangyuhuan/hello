package week4;//第一周题目——温度转换

//第四周题目——素数和：第n个素数到第m个素数之间所有的素数之和
//import java.util.Scanner;
//public class Main {
//    public static void main(String[] args){
//        Scanner in = new Scanner(System.in);
//        int n = in.nextInt();
//        int m = in.nextInt();
//        int count = 1;
//        int num = 2;
//        int sum = 0;
//        while(count<=m){
//            boolean isPrime = true;//是素数
//            for(int i=2;i<num;i++){
//                if(num%i==0){
//                    isPrime = false;
//                    break;
//                }
//            }
//            if(isPrime){
////                System.out.println(num+"是第"+count+"个素数");
//                if(n<=count){
//                    sum += num;
//                }
//                count++;
//            }
//            num++;
//        }
//        System.out.println(sum);
//    }
//}

//念整数
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        String fh = "";
        String result = "";
        if(n<0){
            fh = "fu ";
            n = -n;
        }
        if(n==0){
            result = "ling";
        }
        int count=0;
        while(n>0){
            String r = "";
            switch(n%10){
                case 0:
                    r ="ling";
                    break;
                case 1:
                    r ="yi";
                    break;
                case 2:
                    r ="er";
                    break;
                case 3:
                    r = "san";
                    break;
                case 4:
                    r = "si";
                    break;
                case 5:
                    r = "wu";
                    break;
                case 6:
                    r = "liu";
                    break;
                case 7:
                    r = "qi";
                    break;
                case 8:
                    r = "ba";
                    break;
                case 9:
                    r = "jiu";
                    break;
            }
            if(count==0){
                result = r+result;
            }else{
                result = r+" "+result;
            }
            count++;
            n /=10;
        }
        System.out.print(fh+result);
    }
}