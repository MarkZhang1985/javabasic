package newjava3.ex.ex4;

import java.math.BigInteger;

/**
 * @Auther: zhangkaiming
 * @Date: 2018/8/13
 * @Description:
 * 7、编程序求1!+3!+……+19!。
 */
public class Ex7 {
    public static BigInteger getSum(int num){
        if(num == 1) return new BigInteger("1");
        else return getSum(num-1).multiply(new BigInteger(String.valueOf(num)) );
    }

    public static void main(String[] args) {
        System.out.println("1!+3!+……+19!:");
        BigInteger sum = new BigInteger("0");
        for(int i = 1; i<20; i++){
            if(i%2 !=0 )sum = sum.add(getSum(i));
        }
        System.out.println("sum:" + sum);
    }
}
