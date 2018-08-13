package newjava3.ex.ex4;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

/**
 * @Auther: zhangkaiming
 * @Date: 2018/8/13
 * @Description:
 * 4、求任意10个整数中的偶数的和。
 */
public class TenEvenSum {
    public static void main(String[] args) {
        Random random = new Random();
        List<Integer> list = new ArrayList<>();
        for(int i = 0; i < 10; i++){
            list.add(random.nextInt(1000));
        }
        System.out.println("list:" + list);

        Integer sum = 0;
        for(Integer integer : list){
            if(integer % 2 == 0)sum += integer;
        }
        System.out.println("sum of even numbers:" + sum);
    }
}
