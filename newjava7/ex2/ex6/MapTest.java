package newjava7.ex2.ex6;

import java.util.*;

/**
 * @Auther: zhangkaiming
 * @Date: 2018/8/9
 * @Description:
 * 第六题Map练习题：
 * 请把学生名与考试分数录入到Map中，并按分数显示前三名成绩学员的名字。
 * 姓名	分数
 * Tom	88
 * Jerry	99
 * Michael	78
 * Jeck	67
 * Mark	69
 * Lily		56
 */
public class MapTest {
    public static void main(String[] args) {

        Map<String, Integer> studentScore = new TreeMap<>();
        studentScore.put("Tom",88 );
        studentScore.put("Jerry",99 );
        studentScore.put("Michael",78 );
        studentScore.put("Jack",67 );
        studentScore.put("Mark",69 );
        studentScore.put("Lily",56 );
        System.out.println("original map：" + studentScore);

        //将map条目装进ArrayList中
        List<Map.Entry<String, Integer>> entryList = new ArrayList<>(studentScore.entrySet());
        //按照成绩对条目自然排序
        Collections.sort(entryList, new Comparator<Map.Entry<String, Integer>>() {
            @Override
            public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) {
                return Integer.compare(o1.getValue(), o2.getValue());
            }
        });

        System.out.println("sorted: " + entryList);

        //倒序排列
        Collections.reverse(entryList);
        System.out.println("Top three: ");

        //迭代器遍历
        Iterator iterator = entryList.iterator();
        for(int i = 0; i < 3 && iterator.hasNext(); i++)
            System.out.println("第"+i+"名：" + iterator.next());





    }
}
