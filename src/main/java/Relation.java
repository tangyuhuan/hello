public class Relation {
    public static void main(String[] args){
        double a = 1.0;
        double b = 0.1+0.1+0.1+0.1+0.1+0.1+0.1+0.1+0.1+0.1;
        System.out.println(a==b);//false 浮点数有误差
        System.out.println(a);
        System.out.println(b);
        System.out.println(Math.abs(a-b)<1e-6);//浮点数的比较方式：a与b的差的绝对值是否小于一个比较小的数
    }
}
