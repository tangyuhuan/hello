package week4;

import java.util.Scanner;

//凑硬币：用1元、5元和10元凑出金额
//在循环前增加一个标号来标示循环 lable:
//带标号的break和continue对那个循环起作用
public class GetCoins {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int amount = in.nextInt();//金额
        OUT:
        for(int one=0;one<=amount;one++){
            for(int five=0;five<=amount/5;five++){
                for(int ten=0;ten<=amount/10;ten++){
                    if(one+5*five+10*ten==amount){
                        System.out.println(one+"张1元"+five+"张5元"+ten+"张10元--->"+amount+"元");
                        break OUT;
                    }
                }
            }
        }
    }
}
