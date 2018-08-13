package newjava3.ex.ex4;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * @Auther: zhangkaiming
 * @Date: 2018/8/13
 * @Description:
 * 11、求任一整数x 的各位数字之和。
 */
public class Ex11 {



    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        System.out.println("输入一个整数：");
        Scanner scanner = new Scanner(System.in);
        if(scanner.hasNextInt()){
            int num = scanner.nextInt();
            while (num/10!=0){
                list.add(num%10);
                num /= 10;
            }
            list.add(num%10);
        }
        System.out.println(list);
        int sum = 0;
        for (Integer integer : list)sum += integer;
        System.out.println("sum: " + sum);
    }
}
