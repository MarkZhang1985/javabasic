package newjava3.ex.ex4;

import java.util.Scanner;

/**
 * @Auther: zhangkaiming
 * @Date: 2018/8/13
 * @Description:
 * 14、程序功能是输入一个长整数,求各位数字的平方和。如果输入的是负数,求其相反数的各位数字的平方和。
 * 例如:输入-123,输出14。
 */
public class Ex14 {
    public static void main(String[] args) {
        System.out.println("输入一个整数：(按q退出)");
        Scanner scanner = new Scanner(System.in);
        while (true){
            if(scanner.hasNext()){
                if(scanner.hasNextInt()){
                    int num = Math.abs(scanner.nextInt());
                    int sum = 0;
                    while (num/10!=0){
                        sum += Math.pow(num%10, 2);
                        num /= 10;
                    }
                    sum += Math.pow(num%10, 2);
                    System.out.println("sum: " + sum);
                }
                else if(scanner.next().equals("q")) break;
            }
        }
    }
}
