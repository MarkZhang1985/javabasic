package newjava3.ex.ex4;

/**
 * @Auther: zhangkaiming
 * @Date: 2018/8/13
 * @Description:
 * 12、输出100到1000之间的各位数字之和能被15整除的所有数,输出时每10个一行。
 */
public class Ex12 {

    public static int getDigitNumberSum(int num){
        int sum = 0;
        while (num/10 != 0 ){
            sum += num%10;
            num /= 10;
        }
        sum += num%10;
        return sum;
    }

    public static void main(String[] args) {
        System.out.println("输出100到1000之间的各位数字之和能被15整除的所有数,输出时每10个一行。");
        int flag = 0;
        for(int i = 100; i<=1000; i++){
            if(flag==10){
                System.out.println();
                flag = 0;
            }
            if(getDigitNumberSum(i) % 15 == 0){
                System.out.print(i + " ");
                flag++;
            }
        }

    }
}
