package newjava3.ex.ex4;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @Auther: zhangkaiming
 * @Date: 2018/8/13
 * @Description:
 * 16、有一根27厘米的细木杆，在第3厘米、7厘米、11厘米、17厘米、23厘米这五个位置上各有一只蚂蚁。
 * 木杆很细，不能同时通过一只蚂蚁。开始时，蚂蚁的头朝左还是朝右是任意的，它们只会朝前走或调头，但不会后退。
 * 当任意两只蚂蚁碰头时，两只蚂蚁会同时调头朝反方向走。假设蚂蚁们每秒钟可以走一厘米的距离。
 * 编写程序，求所有蚂蚁都离开木杆的最小时间和最大时间
 */
public class Ex16 {

    class Ant{
        int location;
        int lenth;
        boolean flag;//true：向上 false：向后

        public Ant(int location, boolean flag) {
            this.location = location;
            this.flag = flag;
            lenth = 27;
        }

        public void move(){
            if(flag) location++;
            else location--;
        }

        public boolean isEdge(){
            if(location == 0 || location == lenth) return true;
            else return false;
        }
    }

    public int getStep(Ant[] ants){
        int finished = 0;
        int step = 0;

        while (finished != 5){
            //让所有蚂蚁移动一次。
            for(int i = 0; i < ants.length; i++){
                if(ants[i] != null){
                    ants[i].move();
                    //System.out.println((i+1) + "号蚂蚁移动。");
                    //若蚂蚁到头，则移除这个蚂蚁。
                    if(ants[i].isEdge()){
                        ants[i] = null;
                        //System.out.println((i+1) + "号蚂蚁到达边缘。");
                        finished++;
                    }
                }
            }
            //System.out.println("---------------------");
            step++;
            //若两只蚂蚁相遇，则掉头。
            for (int i = 0; i < ants.length; i++)
                for (int j = i+1; j<ants.length;j++)
                    if(ants[i]!=null && ants[j]!=null && ants[i].location == ants[j].location) {
                        ants[i].flag = !ants[i].flag;
                        ants[j].flag = !ants[j].flag;
                        //System.out.println("|||||||||||||||||||");
                        //System.out.println((i+1) + " 、" + (j+1) + "号蚂蚁掉头。");
                        //System.out.println("|||||||||||||||||||");
                    }
        }
        //System.out.println("step：" + step);
        return step;
    }

    @Test
    public void test(){
        Ant[] ants;
        boolean flag1, flag2, flag3, flag4, flag5;
        List<Integer> results = new ArrayList<>();
        for(int i1 = 0; i1<2; i1++)
            for(int i2 = 0; i2<2; i2++)
                for(int i3 = 0; i3<2; i3++)
                    for(int i4 = 0; i4<2; i4++)
                        for(int i5 = 0; i5<2; i5++) {
                            if (i1 % 2 == 0) flag1 = true;
                            else flag1 = false;
                            if (i2 % 2 == 0) flag2 = true;
                            else flag2 = false;
                            if (i3 % 2 == 0) flag3 = true;
                            else flag3 = false;
                            if (i4 % 2 == 0) flag4 = true;
                            else flag4 = false;
                            if (i5 % 2 == 0) flag5 = true;
                            else flag5 = false;
                            ants = new Ant[]{
                                    new Ant(3, flag1),
                                    new Ant(7, flag2),
                                    new Ant(11, flag3),
                                    new Ant(17, flag4),
                                    new Ant(23, flag5)};
                            results.add(getStep(ants));
                        }
        //System.out.println("步数花费：" + results);
        System.out.println("最大步数：" + Collections.max(results));
        System.out.println("最小步数：" + Collections.min(results));


    }
}
