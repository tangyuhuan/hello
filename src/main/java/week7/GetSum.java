package week7;
//函数初使用
//求出1到10、20到30、35到45的三个和
public class GetSum {
    public static int getSum(int a, int b){
        int sum = 0;
        for(int i=a;i<=b;i++){
            sum+=i;
        }
        return sum;
    }
    public static void f(){
        System.out.println("f()");
    }
    public static int factor(int i)
    {
        if(i==1)
            return i;
        return i*factor(i-1);
    }
    public static void main(String[] args){
        int k = factor(3);
        System.out.println(k);
        f();//此处添加断点，step into就会进入f函数执行
        getSum(1,10);
        System.out.println(getSum(1,10));
        System.out.println(getSum(20,30));
        System.out.println(getSum(35,45));
    }
}
