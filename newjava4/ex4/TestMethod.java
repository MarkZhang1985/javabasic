package newjava4.ex4;

import org.junit.Test;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @Auther: zhangkaiming
 * @Date: 2018/8/14
 * @Description:
 * DateTools测试类
 */
public class TestMethod {
    @Test
    public void test(){

        //获取当前时间的毫秒数
        System.out.println("获取当前时间的毫秒数");
        System.out.println(DateTools.nowTimeMillis());
//        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
//        Date date = new Date();
//        date.setTime(DateTools.nowTimeMillis());
//        System.out.println(sdf.format(date));

        System.out.println("--------------------");
        //按格式yyyy-MM-dd 转换当前日期
        System.out.println("按格式yyyy-MM-dd 转换当前日期");
        System.out.println(DateTools.getReqDate());

        System.out.println("--------------------");
        //按格式yyyy-MM-dd 转换给定日期
        System.out.println("按格式yyyy-MM-dd 转换给定日期");
        Date date = new Date(1999, 1, 1); //这种写法已经过时，一般用下面的写法
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        dateFormat.format(date);
        System.out.println(date);
    }
}
