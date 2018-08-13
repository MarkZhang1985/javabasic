package newjava3.ex.ex4;

import javafx.scene.input.TouchEvent;

import java.util.Scanner;

/**
 * @Auther: zhangkaiming
 * @Date: 2018/8/13
 * @Description:
 * 6、求Sn=a+aa+aaa+...+aa...a之值,其中a是一个数字。例如: 2+22+222+2222(此时n=4),n由键盘输入。
 */
public class Number2SumEx6 {

    public static void main(String[] args) {
        System.out.println("输入一个正整数：");
        Scanner scanner = new Scanner(System.in);
        if(scanner.hasNextInt()){
            int num = scanner.nextInt();
            int temp = 0;
            int sum = 0;
            int[] current = new int[num];
        System.out.print("Sn = ");
            for(int i = 0; i < num; i++){
                current[i] = 2 * (int)Math.pow(10, i);//2、20、200。。。
            }
            for(int i = 0; i<num; i++) {
                if(i >= 0) {
                    temp += current[i];
                    System.out.print(temp);
                }
                if(i < num-1) System.out.print(" + ");
                sum += temp;
            }


            System.out.println("\nsum: " + sum);
        }
    }
}
