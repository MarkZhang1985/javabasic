package newjava7.ex2.ex7;

import org.junit.Test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

/**
 * @Auther: zhangkaiming
 * @Date: 2018/8/9
 * @Description:
 * 第七题 TreeSet练习题：
 * 1. 定义一个Employee类:
 * 1)	该类包含：private成员变量 NAME AGE MYDATE GENDER
 * 2)	其中 birthday 为 MyDate 类的对象。
 * 3)	并为每一个属性定义 getter, setter 方法。
 * 4)	重写 toString 方法输出name, age, birthday。
 *
 * 2.	定义一个MyDate类:
 * 1)	该类包含:	private成员变量YEAR MONTH DAY
 * 2)	并为每一个属性定义 getter, setter 方法；
 *
 * 3.	创建Employee类的5个对象，并把这些对象放入 TreeSet 集合中
 * 	{
 * Michael，18 ，2000-4-23 ，F
 * Jerry，20 ，1998-6-1 ，F
 * Tom，20 ，1998-6-6 ，F
 * Miko ，25 ，1995-12-30 ，M
 * Jen ，18 ， 2000-2-12 ，M
 * }
 *
 * 4.	按以下两种方式对集合中的元素进行排序，并遍历输出：
 *
 * 1). 使Employee 实现 Comparable 接口，并按 name 升序排序
 *
 * 2). 创建 TreeSet 时传入 Comparator对象，按生日日期的降序排序。
 *
 * 提示：Employee类是否需要重写equals()方法？MyDate类呢？
 */
public class TreeSetTest {
    @Test
    public void test(){


        //使Employee 实现 Comparable 接口，并按 name 升序排序
        Set<Emploee> set = new TreeSet<>();
        set.add(new Emploee("Michael", 18, "2000-4-23", "F"));
        set.add(new Emploee("Jerry", 20, "1998-6-1", "F"));
        set.add(new Emploee("Tom", 20, "1998-6-6", "F"));
        set.add(new Emploee("Miko", 25, "1995-12-30", "M"));
        set.add(new Emploee("Jen", 18, "2000-2-12", "M"));

        System.out.println(set);

        Comparator comparator = new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                int result = Integer.compare(((Emploee) o1).getAge(), ((Emploee) o2).getAge());
                if(result == 0){
                    result = ((Emploee) o1).getName().compareTo(((Emploee) o2).getName());
                }
                return result;
            }
        };

        System.out.println("-----------------------");

        //创建 TreeSet 时传入 Comparator对象，按年龄排序。
        set = new TreeSet<>(comparator);
        set.add(new Emploee("Michael", 18, "2000-4-23", "F"));
        set.add(new Emploee("Jerry", 20, "1998-6-1", "F"));
        set.add(new Emploee("Tom", 20, "1998-6-6", "F"));
        set.add(new Emploee("Miko", 25, "1995-12-30", "M"));
        set.add(new Emploee("Jen", 18, "2000-2-12", "M"));

        System.out.println(set);

        comparator = new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                //int year1 = Integer.valueOf(((Emploee)o1).getBirthday().getYear()).intValue();
                System.out.println("compare running.");
                int result = 0;
                String s1 =  ((Emploee)o1).getBirthday().getYear() + "-" + ((Emploee)o1).getBirthday().getMonth() + "-" + ((Emploee)o1).getBirthday().getDay();
                String s2 =  ((Emploee)o2).getBirthday().getYear() + "-" + ((Emploee)o2).getBirthday().getMonth() + "-" + ((Emploee)o2).getBirthday().getDay();
                SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
                try {
                    Date date1 = simpleDateFormat.parse(s1);
                    Date date2 = simpleDateFormat.parse(s2);
                    result = date1.compareTo(date2);
                } catch (ParseException e) {
                    e.printStackTrace();
                }

                return result;
            }
        };

        System.out.println("-----------------------");

        //创建 TreeSet 时传入 Comparator对象，按生日日期的降序排序。
        set = new TreeSet<>(comparator);
        Collections.addAll(set,
                new Emploee("Michael", 18, "2000-4-23", "F"),
                new Emploee("Jerry", 20, "1998-6-1", "F"),
                new Emploee("Tom", 20, "1998-6-6", "F"),
                new Emploee("Miko", 25, "1995-12-30", "M"),
                new Emploee("Jen", 18, "2000-2-12", "M")
                );

        System.out.println(set);


    }
}
