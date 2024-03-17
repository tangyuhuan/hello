package week4;

//获得前50个素数
//素数:只能被1和自己整除的数，不包括1

public class Get50PrimeNum {
    public static void main(String[] args){
        int count = 1;
        int num = 2;
        while(count<=50){
            boolean isPrime = true;//是素数
            for(int i=2;i<num;i++){
                if(num%i==0){
                    isPrime = false;
                    break;
                }
            }
            if(isPrime){
                System.out.println(num+"是第"+count+"个素数");
                count++;
            }
            num++;
        }


    }
}
