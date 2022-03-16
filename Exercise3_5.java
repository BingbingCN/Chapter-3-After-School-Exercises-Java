package Exercise;

import java.math.BigInteger;

//计算阶乘100到200项之和
public class Exercise3_5 {
    //计算阶乘的function
    static BigInteger getY(int x){
        BigInteger y= BigInteger.valueOf(1);
        int i;
        for(i=1;i<=x;i++){
            y=y.multiply(BigInteger.valueOf(i));
        }
        return y;
    }
    public static void main(String[] arg){
        BigInteger sum=BigInteger.valueOf(0);
        for(int i=100;i<=200;i++){
           sum=sum.add(getY(i));
        }
        System.out.println(sum);
    }
}
