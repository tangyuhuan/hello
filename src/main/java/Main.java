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
import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int number = in.nextInt();
        String R="",S="";
        switch(number/10){
            case 1:
                R="Unreadable";
                break;
            case 2:
                R="Barely readable, occasional words distinguishable";
                break;
            case 3:
                R="Readable with considerable difficulty";
                break;
            case 4:
                R="Readable with practically no difficulty";
                break;
            case 5:
                R="Perfectly readable";
                break;
        }
        switch(number-number/10*10){
            case 1:
                S="Faint signals, barely perceptible";
                break;
            case 2:
                S="Very weak signals";
                break;
            case 3:
                S="Weak signals";
                break;
            case 4:
                S="Fair signals";
                break;
            case 5:
                S="Fairly good signals";
                break;
            case 6:
                S="Good signals";
                break;
            case 7:
                S="Moderately strong signals";
                break;
            case 8:
                S="Strong signals";
                break;
            case 9:
                S="Extremely strong signals";
                break;
        }

        System.out.println(S+", "+(R.substring(0,1).toLowerCase()+R.substring(1))+".");
    }

}