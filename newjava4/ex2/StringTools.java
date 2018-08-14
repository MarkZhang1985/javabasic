package newjava4.ex2;

/**
 * @Auther: zhangkaiming
 * @Date: 2018/8/14
 * @Description:
 * 1.    禁止创建对象，并且该类不能被继承
 *
 * public static boolean isNull (String original)
 * 判断字符串是否为null
 *
 * public static boolean isBlank (String original)
 * 判断字符串是否为空，为Null
 *
 * 2.	public static boolean isNotEmpty (String original)
 * 判断传入的字符串是否非空，即字符串是否等于null，空串，“       ”。
 *
 * 3.	public static String convertNull (String original)
 * 转换Null，如果字符串为空，转换为空串返回，否则返回原字符串
 *
 * 4.	public static String convertNull (String original, String target)
 * 转换Null，如果字符串为空，使用target替换原字符串返回。否则返回原字符串
 *
 * 5.	public static int convertNullToNumber (String original)
 * 转换Null，如果字符串为null，或者空字符串，返回0，否则返回原字符串的整数类型
 *
 * 6.	public static int convertNullToNumber (String original, int target)
 * 转换Null，如果字符串为null，或者空字符串，返回target，否则返回原字符串的整数类型。
 *
 * 7.	public static Integer transformInteger (String original)
 * 将传入的字符串转换为整数类型
 *
 * 8.	public static Long transformLong (String original)
 * 将传入的字符串转换为长整型类型
 *
 * 9.	public static Float transformFloat (String original)
 * 将传入的字符串转换为单精度浮点类型
 *
 * 10.	public static Double transformDouble (String original)
 * 将传入的字符串转换为双精度浮点类型
 *
 * 11.	public static boolean isSameCodeAppearsTwoTimes (String original, String sameCode)
 * 判断相同代码是否出现2次以上
 *
 * 12.	public static String substringSameCodeFirst (String original, String sameCode)
 * 如果有相同代码，截取第一次出现的代码，到第二次出现的位置结束的字符串
 *
 * 13.	public static String subStringSameCodeForLast (String original, String sameCode)
 * 如果有相同代码，截取第二次出现的代码开始一直到最后的字符串
 *
 * 14.	public static String subStringSameCodeForLastRecursion (String original, String code)
 * 如果有2次以上相同代码，截取最后一次出现的代码开始到最后的字符串
 *
 * 15.	public static String [] substringSameCodeForStringArray (String original，String code)
 * 以相同代码分段，存入数组中返回
 *
 * 16.	public static String [] ConformingSeparation (String original, String seperator)
 * 以指定符号对字符串进行分隔，并生成数组返回
 *
 * 17.	public static String [] ConformingSeparation (String original)
 * 以默认符号“，”对字符串进行分隔，并生成数组返回，“，”设置为常量
 *
 * 18.	public static String objectConverLowerString (Object original)
 * 对象转小写字符串
 *
 * 19.	public static String objectConverUpperString (Object original)
 * 对象转大写字符串
 *
 * 20.	public static String charArrayConvertString (char [] chars)
 * 将字符数组拼接成字符串
 *
 * 21.	public static String StringArrayConvertString (String [] original)
 * 将字符串数组拼接成字符串
 *
 * 22.	public static String padLeft (String original, String padding)
 * 判断原字符串中是否有padding的内容，没有在左边进行拼接
 *
 * 23.	public static String padRight (String original, String padding)
 * 判断原字符串中是否有padding的内容，没有在右边进行拼接
 */
public final class StringTools {

    final static String SEPERATOR = "，";


    //禁止创建对象，并且该类不能被继承
    private StringTools() {
    }

    //判断字符串是否为null
    public static boolean isNull(String original){
        return original == null;
    }

    //判断字符串是否为空，为Null
    public static boolean isBlank(String original){
        return original == null || original.length() == 0;
    }

    //判断传入的字符串是否非空，即字符串是否等于null，空串，“       ”。
    public static boolean isNotEmpty(String original){
        return original != null && original.trim().length() != 0;
    }

    //转换Null，如果字符串为空，转换为空串返回，否则返回原字符串
    public static String convertNull(String original){
        return isNull(original) ? "" : original;
    }

    //换Null，如果字符串为空，使用target替换原字符串返回。否则返回原字符串
    public static String convertNull(String original, String target){
        return isNull(original) ? target : original;
    }

    //转换Null，如果字符串为null，或者空字符串，返回0，否则返回原字符串的整数类型
    public static int convertNullToNumber(String original){
        return isBlank(original) ? 0 : Integer.valueOf(original);
    }

    //转换Null，如果字符串为null，或者空字符串，返回target，否则返回原字符串的整数类型。
    public static int convertNullToNumber (String original, int target){
        return isBlank(original) ? target : Integer.valueOf(original);
    }

    //将传入的字符串转换为整数类型
    public static Integer transformInteger (String original){
        return Integer.valueOf(original);
    }

    //将传入的字符串转换为长整型类型
    public static Long transformLong (String original){
        return Long.valueOf(original);
    }

    //将传入的字符串转换为单精度浮点类型
    public static Float transformFloat (String original){
        return Float.valueOf(original);
    }

    //将传入的字符串转换为双精度浮点类型
    public static Double transformDouble (String original){
        return Double.valueOf(original);
    }

    //判断相同代码是否出现2次以上
    public static boolean isSameCodeAppearsTwoTimes (String original, String sameCode){
        int start = 0;
        int times = 0;

        while (original.indexOf(sameCode, start) >= 0){
            start = original.indexOf(sameCode, start) + sameCode.length();
            times++;
        }
        if(times >= 2) return true;
        else return false;

    }

    //如果有相同代码，截取第一次出现的代码，到第二次出现的位置结束的字符串
    public static String substringSameCodeFirst (String original, String sameCode){
        int start, end;
        String result;
        start = original.indexOf(sameCode);
        end = original.indexOf(sameCode, start + sameCode.length()) + sameCode.length();
        result = original.substring(start, end);

        return result;
    }

    //如果有相同代码，截取第二次出现的代码开始一直到最后的字符串
    public static String subStringSameCodeForLast (String original, String sameCode){
        int start;
        String result;
        start = original.indexOf(sameCode, original.indexOf(sameCode) + sameCode.length());
        result = original.substring(start);

        return result;
    }

    //如果有2次以上相同代码，截取最后一次出现的代码开始到最后的字符串
    public static String subStringSameCodeForLastRecursion (String original, String code){
        String results = null;
        if(isSameCodeAppearsTwoTimes(original, code)){
            int start = 0;
            while ( (original.indexOf(code, start)) >= 0 ){//若还存在重复字符串则继续循环
                start = original.indexOf(code, start) + code.length();//进入下一个寻找位置
            }
            start -= code.length();//返回最后一个重复字符串的起始位置
            results = original.substring(start);
        }else {
            System.out.println("不存在2次以上相同代码。");
        }
        return results;
    }

    //以相同代码分段，存入数组中返回
    public static String [] substringSameCodeForStringArray (String original, String code){
        return original.split(code);
    }

    //以指定符号对字符串进行分隔，并生成数组返回
    public static String [] ConformingSeparation (String original, String seperator){
        return original.split(seperator);
    }

    //以默认符号“，”对字符串进行分隔，并生成数组返回，“，”设置为常量
    public static String [] ConformingSeparation (String original){
        return original.split(SEPERATOR);
    }

    //对象转小写字符串
    public static String objectConverLowerString (Object original){
        return String.valueOf(original).toLowerCase();
    }

    //对象转大写字符串
    public static String objectConverUpperString (Object original){
        return String.valueOf(original).toUpperCase();
    }

    //将字符数组拼接成字符串
    public static String charArrayConvertString (char [] chars){
        return String.valueOf(chars);
    }

    //将字符串数组拼接成字符串
    public static String StringArrayConvertString (String [] original){
        StringBuffer stringBuffer = new StringBuffer();
        for(String s : original)stringBuffer.append(s);
        return stringBuffer.toString();
    }

    //判断原字符串中是否有padding的内容，没有在左边进行拼接
    public static String padLeft (String original, String padding){
        return original.contains(padding) ? original : (padding + original);
    }

    //判断原字符串中是否有padding的内容，没有在右边进行拼接
    public static String padRight(String original, String padding){
        return original.contains(padding) ? original : (original + padding);
    }
}
