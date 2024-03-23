package week6;
import java.util.Scanner;
public class StringIn {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        //in.nextLine()读入一整行
        String line = in.nextLine();
        System.out.println(line);
        //in.next()读入一个单词，单词的标志是空格
        String s = in.next();
        System.out.println(s);
    }
}
