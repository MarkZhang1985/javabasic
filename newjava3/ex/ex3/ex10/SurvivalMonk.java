package newjava3.ex.ex3.ex10;

/**
 * @Auther: zhangkaiming
 * @Date: 2018/8/7
 * @Description:
 * 10.    有个国王要杀100个和尚。他把100个和尚按顺序编号从1到100，
 * 然后连成一个圆圈。从编号1的开始数起，数到第5个的和尚杀掉。
 * 以此类推，问：最后那个幸存的和尚的编号是多少？
 */
public class SurvivalMonk {

    public static void main(String[] args) {
        int num = 100;
        int[] monk = new int[num];
        int killed = 0;//被杀和尚总数
        int flag = 0;//计数，5个
        for(int i = 0; i < num; i++){
            monk[i] = i+1;
        }

        while (killed < num-1) {
            for (int i = 0; i < num; i++) {
                if (monk[i] != 0){
                    flag++;
                    if(flag == 5){
                        monk[i] = 0;
                        flag = 0;
                        killed++;
                    }
                }
            }
        }

        for(int i = 0; i < num; i++)
            if(monk[i] != 0) System.out.println("幸存的和尚是：" + (i+1) + "号。");

    }
}
