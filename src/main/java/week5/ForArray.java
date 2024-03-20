package week5;

import java.util.Scanner;

public class ForArray {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] data = {3,4,2,1,14,16,32};
        int x = in.nextInt();
        int loc = -1;
        boolean found =  false;
        for(int i=0;i<data.length;i++){
            if(x == data[i])
            {
                loc = i;
                break;
            }
        }
        //for-each遍历，可以读出数组中的每一个值，但不能修改数组
        for(int k:data)
        {
            if(k==x){
                found = true;
            }
        }
        System.out.println(found);
        if(loc > -1)
        {
            System.out.println(x+"是第"+(loc+1)+"个");
        }
        else
        {
            System.out.println(x+"不在其中");
        }
    }
}
