import java.util.Scanner;

public class BuyTicketMachine {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.print("请投币：");
        int amount = in.nextInt();
        if( amount>=10 )
        {
            //打印车票
            System.out.println("****************");
            System.out.println("*java城际铁路专线*");
            System.out.println("****票价10元*****");
            System.out.println("****************");
            System.out.println("找零："+(amount-10));
        }
    }
}
