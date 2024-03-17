package week2;

import java.util.Scanner;

public class BuyTicketMachine {
    public static void main(String[] args){
        int balance = 0;
        Scanner in = new Scanner(System.in);
        while(true){
            System.out.print("请投币：");
            int amount = in.nextInt();
            balance += amount;
            if( balance>=10 )
            {
                //打印车票
                System.out.println("****************");
                System.out.println("*java城际铁路专线*");
                System.out.println("****票价10元*****");
                System.out.println("****************");
                System.out.println("找零："+(balance-10));
                balance = 0;
            }
        }
    }
}
