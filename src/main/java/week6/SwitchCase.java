package week6;

import java.util.Scanner;

//在switch-case中使用字符串(1.7及以上版本)
public class SwitchCase {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        switch(s){
            case"yes":
                System.out.println("out:yes");
                break;
            case"no":
                System.out.println("out:no");
                break;
            default:
                System.out.println("out:default");
        }

    }
}
