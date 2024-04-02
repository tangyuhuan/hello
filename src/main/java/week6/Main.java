package week6;

import java.util.Scanner;

//题目1：单词长度
//注意只录入.不需要输出
//public class Main {
//    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//        String line = in.nextLine();
//        String[] array = line.split("\\s+"); //匹配一个或多个空白字符可以使用 \s+
////        System.out.println(array.length);
//        for(int i=0;i<array.length-1;i++){
////            System.out.println(array[i]);
//            if(array[i].length()>0){
//                System.out.print(array[i].length()+" ");
//            }
//        }
//        if((array[array.length-1].length()-1)!=0){
//            System.out.print(array[array.length-1].length()-1);
//        }
//    }
//}


//题目二：GPS数据处理
//从中找出$GPRMC语句，计算校验和，找出其中校验正确，并且字段2表示已定位的语句，从中计算出时间，换算成北京时间
//一次数据中会包含多条$GPRMC语句，以最后一条语句得到的北京时间作为结果输出
//北京时间 = UTC时间+8个小时
//Integer.parseInt(s,16)从String变量s中得到其表达的整数数字，16表示16进制
//输入：$GPRMC,024813.640,A,3158.4608,N,11848.3737,E,10.05,324.27,150706,,,A*50
//输出：10:48:13
//注意：跨日的运算、补0
import java.util.Arrays;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String line = in.nextLine();
        String bjtime = "";
        while(!line.equals("END")){
            if(line.startsWith("$GPRMC")){
                String[] array = line.split(",");
                String str = Arrays.toString(array).replaceAll("[\\[\\],\\s]", "");
                String str2 = str.substring(1,(str.length()-3));
                String str3 = str.substring(str.length()-2);
                int goal = Integer.parseInt(str3,16);
                int result = str2.charAt(0);
                for(int i=1;i<str2.length();i++){
                    result = result^str2.charAt(i);
                }
                result = result%65536;
                if((array[2].equals("A"))&&(result==goal)){
                    String hh = "";
                    if((Integer.parseInt(str.substring(6,8))+8)>=24){
                        hh = "0"+(Integer.parseInt(str.substring(6,8))+8-24);
                    }
                    else if((Integer.parseInt(str.substring(6,8))+8)<10){
                        hh = "0"+(Integer.parseInt(str.substring(6,8))+8);
                    }
                    else{
                        hh = Integer.parseInt(str.substring(6,8))+8+"";
                    }
                    bjtime = hh+":"+str.substring(8,10)+":"+str.substring(10,12);
                }
            }
            line = in.nextLine();
        }
        System.out.println(bjtime);

    }
}