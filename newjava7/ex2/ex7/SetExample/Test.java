package newjava7.ex2.ex7.SetExample;

import java.util.*;

/**
 * @Auther: zhangkaiming
 * @Date: 2018/8/10
 * @Description:
 */
public class Test {

    public static void main(String[] args) {
        //Integer中实现了Comparable接口，实现了equals方法，hashCode方法。
//        Set<Integer> set = new HashSet<Integer>();
        Set<Integer> set = new TreeSet<>();
        Collections.addAll(set, 1, 2, 1);//1被判断为重复元素，不会再次进入set
        System.out.println("Integer Set : " + set);

        //String中实现了Comparable接口，实现了equals方法，hashCode方法。
        //Set<String> stringSet = new HashSet<String>();
        Set<String> stringSet = new TreeSet<>();
        //Collections.addAll(stringSet, "12", "034");
        Collections.addAll(stringSet, "12 034".split(" "));
        System.out.println("String Set : " + stringSet);

        Person p1 = new Person("fan");
        Person p2 = new Person("hehe");
        Person p3 = new Person("fan");
        Person p4 = new Person("axyz");
        //Person p5 = null;  //加到TreeSet中会报错，NPE（NullPointerException），因为往里放时会调用compareTo方法。

        //HashSet：首先判断hashCode是否相同，相同则再运行equals是否相同。
        Set<Person> personHashSet = new HashSet<>();
        Collections.addAll(personHashSet, p1, p2, p3, p4);
        System.out.println("personHashSet : " + personHashSet); //顺序不一定
        //LinkedHashSet：同上。
        Set<Person> personLinkedHashSet = new LinkedHashSet<Person>();
        Collections.addAll(personLinkedHashSet, p1, p2, p3, p4);
        System.out.println("personLinkedHashSet : " + personLinkedHashSet);  //按照插入顺序
        //TreeSet：通过compare判断。
        Set<Person> personTreeSet = new TreeSet<>();
        Collections.addAll(personTreeSet, p1, p2, p3, p4);
        System.out.println("personTreeSet : " + personTreeSet);  //按照字母顺序
    }
}
