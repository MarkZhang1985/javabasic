package newjava4.ex4;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @Auther: zhangkaiming
 * @Date: 2018/8/14
 * @Description:
 * 1.禁止创建对象，并且该类不能被继承
 * 2.创建属性
 * Public static String DATE_FORMAT_DATEONLY = “yy-MM-dd”；//70-01-01
 * public static String DATE_FORMAT_DATEONLY = "yyyy-MM-dd"; // 1970-01-01
 * public static String DATE_FORMAT_DATETIME = "yyyy-MM-dd HH:mm:ss"; // 年-月-日 时：分：秒 1970-01-01 00:00:00
 * public static String DATE_FORMAT_TIMEONLY = “HH:mm:ss” //时：分：秒 00:00:00
 *
 * 3.	static long nowTimeMillis ()
 * 获取当前时间的毫秒数
 * 4.	static String getReqDate ()
 * 按格式yyyy-MM-dd 转换当前日期
 * 5.	static String getReqDate (Date date)
 * 按格式yyyy-MM-dd 转换给定日期
 * 6.	static String TimestampToDateStr (Timestamp timestamp)
 * 按格式yyyy-MM-dd 转换给定的时间戳
 * 7.	static String getReqTime ()
 * 按格式HH:mm:ss 转换当前时间
 * 8.	static String getTimeStampStr (Date date)
 * 按格式yyyy-MM-dd HH:mm:ss 转换给定时间
 * 9.	static String getDateTimeString ()
 * 按格式yyyy-MM-dd HH:mm:ss 转换当前时间
 * 10.	static String getDateTimeString (Timestamp time)
 * 按格式yyyy-MM-dd HH:mm:ss 转换给定的时间戳
 * 11.	static Date addSecond (Date date, int second)
 * 12.	static Date addMinute (Date date, int minute)
 * 13.	static Date addHour (Date date, int hour)
 * 14.	static Date getDayEnd (Date date)
 * 15.	static Date addDay (Date date, int day)
 * 16.	static Date getMonthEnd (Date date)
 * 17.	static Date addYear (Date date, int year)
 * 18.	static Timestamp strToTimestamp (String dateString)
 * 19.	static Timestamp strToTimestamp (Date date)
 * 20.	static Timestamp getCurTimestamp ()
 * 21.	static int getYear ();
 * 22.	static int getYear (Date date)
 * 23.	static int getMonth ()
 * 24.	static int getMonth (Date date)
 * 25.	static int getDay ()
 * 26.	static int getDay (Date date)
 * 27.	static int getHour ()
 * 28.	static int getHour (Date date)
 * 29.	static int getMinute ()
 * 30.	static int getMinute (Date date)
 * 31.	static int getSecond ()
 * 32.	static int getSecond (Date date)
 * 33.	static Date getBeforeSpecifiedDay (Date date, int date)
 * 34.	static Date getAfterSpecifiedDay (Date date, int date)
 * 35.	static Date getBeforeSpecifiedMonth (Date date, int month)
 * 36.	static Date getAfterSpecifiedMonth (Date date, int month)
 * 37.	static Date getBeforeSpecifiedYear (Date date, int year)
 * 38.	static Date getAfterSpecifiedYear (Date date, int year)
 * 39.	static Date convertStrToDate (String date, String format)
 * 40.	static Long convertStrToLong (String date, String format)
 * 41.	static String convertDateToString (Date date, String format)
 * 42.	static Long convertDateToLong (Date date)
 * 43.	static String convertLongToString (Long date, String format)
 * 44.	static Date convertLongToDate (Long date)
 */
public final class DateTools {

    public static String DATE_FORMAT_DATEONLY_TWOYEAR = "yy-MM-dd"; //70-01-01
    public static String DATE_FORMAT_DATEONLY = "yyyy-MM-dd"; // 1970-01-01
    public static String DATE_FORMAT_DATETIME = "yyyy-MM-dd HH:mm:ss"; // 年-月-日 时：分：秒 1970-01-01 00:00:00
    public static String DATE_FORMAT_TIMEONLY = "HH:mm:ss"; //时：分：秒 00:00:00

    private DateTools() {
    }

    //获取当前时间的毫秒数
    static long nowTimeMillis (){
        return (new Date()).getTime();
    }

    //按格式yyyy-MM-dd 转换当前日期
    static String getReqDate (){
        return new SimpleDateFormat(DATE_FORMAT_DATEONLY).format(new Date());
    }

    //按格式yyyy-MM-dd 转换给定日期
    static String getReqDate (Date date){
        SimpleDateFormat simpleDateFormat= new SimpleDateFormat(DATE_FORMAT_DATEONLY);
        simpleDateFormat.format(date);
        System.out.println(date);
        return new SimpleDateFormat(DATE_FORMAT_DATEONLY).format(date);
    }


}
