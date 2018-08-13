package newjava7.ex2.ex7;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Objects;

/**
 * @Auther: zhangkaiming
 * @Date: 2018/8/9
 * @Description:
 * 1)	该类包含：private成员变量 NAME AGE MYDATE GENDER
 * 2)	其中 birthday 为 MyDate 类的对象。
 * 3)	并为每一个属性定义 getter, setter 方法。
 * 4)	重写 toString 方法输出name, age, birthday。
 */
public class Emploee implements Comparable{

    private String name;
    private int age;
    private MyDate birthday;
    private String gender;

    public Emploee(String name, int age, String birthday, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        if(isValidDate(birthday)){
            String[] str = birthday.split("-");
            this.birthday = new MyDate(str[0], str[1], str[2] );
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public MyDate getBirthday() {
        return birthday;
    }

    public void setBirthday(MyDate birthday) {
        this.birthday = birthday;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "\nEmploee{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", birthday=" + birthday.getYear() +"-" + birthday.getMonth() + "-" + birthday.getDay() +
                ", gender='" + gender + '\'' +
                '}';
    }

    public  boolean isValidDate(String str) {
        boolean convertSuccess=true;
        // 指定日期格式为四位年/两位月份/两位日期，注意yyyy/MM/dd区分大小写；
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
        try {
            // 设置lenient为false. 否则SimpleDateFormat会比较宽松地验证日期，比如2007/02/29会被接受，并转换成2007/03/01
            format.setLenient(false);
            format.parse(str);
        } catch (ParseException e) {
            // e.printStackTrace();
            // 如果throw java.text.ParseException或者NullPointerException，就说明格式不对
            convertSuccess=false;
        }
        return convertSuccess;
    }

    @Override
    public int compareTo(Object o) {
        System.out.println("Emploee compareTo");
        return this.name.compareTo(((Emploee) o).name);
    }

    @Override
    public boolean equals(Object o) {
        System.out.println("Emploee equals");
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Emploee emploee = (Emploee) o;
        return age == emploee.age &&
                Objects.equals(name, emploee.name) &&
                Objects.equals(birthday, emploee.birthday) &&
                Objects.equals(gender, emploee.gender);
    }

    @Override
    public int hashCode() {
        System.out.println("Emploee hashCode");
        return Objects.hash(name, age, birthday, gender);
    }
}
