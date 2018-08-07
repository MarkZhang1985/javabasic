package newjava7.ex2.ex4;

import java.util.*;

/**
 * @Auther: zhangkaiming
 * @Date: 2018/8/7
 * @Description:
 * 第四题ArrayList集合排序：
 * 使用Scanner类从键盘随机输入10个整数保存到List集合中，并按倒序、从大到小的顺序显示出来。
 */
public class TenInt {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List list = new ArrayList();
        int max = 10;
        System.out.println("请输入" + max + "个整数。");
        for(int i = 0; i < max; i++){
            System.out.println("输入第" + (i+1) + "个：");
            while (true){
                if(scanner.hasNextInt()){
                    list.add(scanner.nextInt());
                    break;
                }
                else System.out.println("输入有误，请重新输入。");
                scanner = new Scanner(System.in);
            }
        }

        System.out.println("原始数组：");
        System.out.println(list);
        System.out.println("倒序数组：");
        Collections.reverse(list);
        System.out.println(list);
        System.out.println("从大到小：");
        Collections.sort(list);
        Collections.reverse(list);
        System.out.println(list);
    }
}
