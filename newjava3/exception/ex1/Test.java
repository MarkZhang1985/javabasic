package newjava3.exception.ex1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/**
 * @Auther: zhangkaiming
 * @Date: 2018/8/13
 * @Description:
 * 写一个方法void triangle(int a,int b,int c)，判断三个参数是否能构成一个三角形。
 *  * 如果不能则抛出异常IllegalArgumentException，显示异常信息：a,b,c “不能构成三角形”；
 *  * 如果可以构成则显示三角形三个边长。在主方法中得到命令行输入的三个整数，调用此方法，并捕获异常。
 *  * a<b<c
 *  * 两边之和大于第三边：a+b>c
 *  * 两边之差小于第三边：c-b<a
 *
 *  三条边必须满足： 三角形两边之和大于第三边，两边之差小于第三边。
 *  （三角形两边之和大于第三边中的两边是指两条较小的边，两边之差小于第三边的两边是指两条较大的边。）
 *  还有斜边的长度大于其他的两条边
 */
public class Test {

    public void triangle(int a, int b, int c) throws IllegalArgumentException {
        List<Integer> list = new ArrayList<>();
        list.add(a);
        list.add(b);
        list.add(c);
        Collections.sort(list);
        if(list.get(0) + list.get(1) > list.get(2)
                && list.get(2) - list.get(1) < list.get(0)
                && list.get(2) >= list.get(1)){
            System.out.println("可以构成三角形。" + "\ta：  " + a + "\tb：  " + b + "\tc：  " + c);
        }else {
            throw new IllegalArgumentException(a, b, c);
        }

    }

    public static void main(String[] args) {
        Test test = new Test();
        Scanner scanner = new Scanner(System.in);
        while (true) {
            int a = 0, b = 0, c = 0;
            System.out.println("输入三角形边长。");
            System.out.println("a: ");
            if (scanner.hasNextInt()) a = scanner.nextInt();
            System.out.println("b: ");
            if (scanner.hasNextInt()) b = scanner.nextInt();
            System.out.println("c: ");
            if (scanner.hasNextInt()) c = scanner.nextInt();

            try {
                test.triangle(a, b, c);
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
        }

    }
}
