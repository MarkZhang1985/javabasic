package newjava3.ex.ex4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

/**
 * @Auther: zhangkaiming
 * @Date: 2018/8/13
 * @Description:
 * 求20个数中的最大的偶数和最小的奇数的差。
 */
public class BigEvenAndSmallOddEx5 {

    public static void main(String[] args) {
        Random random = new Random();
        List<Integer> list = new ArrayList<>();
        for(int i = 0; i < 20; i++){
            list.add(random.nextInt(1000));
        }
        System.out.println("list:" + list);

        Collections.sort(list);

        System.out.println("sorted list: " + list);

        int bigEven = 0;
        int smallOdd = 0;
        for(int i = 0; i<list.size(); i++){
            if(list.get(i) % 2 != 0){
                smallOdd=list.get(i);
                break;
            }
        }
        for(int i = list.size()-1; i>=0; i--){
            if(list.get(i) % 2 == 0){
                bigEven=list.get(i);
                break;
            }
        }

        System.out.println("smallOdd: " + smallOdd);
        System.out.println("bigEven: " + bigEven);
        System.out.println("sum: " + (smallOdd + bigEven));
    }

}
