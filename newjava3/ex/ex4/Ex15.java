package newjava3.ex.ex4;

import java.util.Scanner;

/**
 * @Auther: zhangkaiming
 * @Date: 2018/8/13
 * @Description:
 * 15、一个5位数,判断它是不是回文数。例如12321是一个回文数,即它的个位与万位相同,十位与千位相同
 */
public class Ex15 {

    public static void main(String[] args) {
        int[] ints = new int[5];
        System.out.println("输入一个整数：(按q退出)");
        Scanner scanner = new Scanner(System.in);
        while (true){
            if(scanner.hasNext()){
                if(scanner.hasNextInt()){
                    int num = Math.abs(scanner.nextInt());
                    int index = 0;
                    while (num/10!=0){
                        ints[index] = num%10;
                        num /= 10;
                        index++;
                    }
                    ints[index] = num%10;

                    if(ints[0] == ints[4] && ints[1] == ints[3] && ints[0] - ints[1] == ints[1] - ints[2])
                        System.out.println("是回文数。");
                    else System.out.println("不是回文数。");
                }
                else if(scanner.next().equals("q")) break;
            }
        }
    }
}
