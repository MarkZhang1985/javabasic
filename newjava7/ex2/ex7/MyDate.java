package newjava7.ex2.ex7;

/**
 * @Auther: zhangkaiming
 * @Date: 2018/8/9
 * @Description:
 * 1)	该类包含:	private成员变量YEAR MONTH DAY
 * 2)	并为每一个属性定义 getter, setter 方法；
 */
public class MyDate {

    private String year;
    private String month;
    private String day;

    public MyDate(String year, String month, String day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getMonth() {
        return month;
    }

    public void setMonth(String month) {
        this.month = month;
    }

    public String getDay() {
        return day;
    }

    public void setDay(String day) {
        this.day = day;
    }
}
