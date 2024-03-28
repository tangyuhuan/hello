package week7;

//当函数期望的参数类型比调用函数时给的值的类型宽的时候，例如double能表达比int更多的东西，将int给到double没问题
//编译器会做自动类型转换 char->int->double

public class GetMax {
    public static int max(double a,int b){
        int ret;
        if(a>b)
        {
            ret = (int)a;
        }
        else
        {
            ret = b;
        }
        return ret;
    }
    public static int getValue(int i) {
        int result = 0;
        switch (i) {
            case 1:
                result = result + i;
            case 2:
                result = result + i  * 2;
            case 3:
                result = result + i  * 3;
        }
        return result;
    }

    public static void main(String[] args){
        int a = 5;
        int b = 6;
        int c;
        c = max(18,12);
//        c = max(a,b);
//        c = max(max(c,a),max(5,b));
        System.out.println(c);
    }
}
