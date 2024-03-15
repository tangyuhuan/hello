import java.util.Scanner;

public class Hello {
    public static void main(String[] args){
//        System.out.println("Hello word");
        Scanner in = new Scanner(System.in);
//        System.out.println("echo:"+in.nextLine());
//        System.out.println(2+3+"=2+3="+(2+3));
//        System.out.println("100-"+in.nextInt()+"="+(100-in.nextInt()));//连续等待两个输入
        System.out.print("请输入票面：");
        int amount;
        amount = in.nextInt();
        System.out.print("请输入金额：");
        int price;//定义
//        System.out.println(price);//price没有初始化 不能直接使用
        price = in.nextInt();//赋值
//        final int amount = 100;

        System.out.println(amount+"-"+price+"="+(amount-price));

    }

}
