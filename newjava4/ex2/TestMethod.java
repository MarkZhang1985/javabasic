package newjava4.ex2;

import newjava7.ex2.ex7.SetExample.Person;
import org.junit.Test;

import java.util.Arrays;

/**
 * @Auther: zhangkaiming
 * @Date: 2018/8/14
 * @Description:
 */
public class TestMethod {

    @Test
    public void test(){

        String s = null;
        //判断字符串是否为null
        System.out.println("\n1:");
        System.out.println(StringTools.isNull(s));
        System.out.println(StringTools.isNull(""));
        System.out.println(StringTools.isNull("2 2"));

        //判断字符串是否为空，为Null
        System.out.println("\n2:");
        System.out.println(StringTools.isBlank(s));
        System.out.println(StringTools.isBlank(""));
        System.out.println(StringTools.isBlank("2 2"));

        //判断传入的字符串是否非空，即字符串是否等于null，空串，“       ”。
        System.out.println("\n3:");
        System.out.println(StringTools.isNotEmpty(s));
        System.out.println(StringTools.isNotEmpty(""));
        System.out.println(StringTools.isNotEmpty("  "));
        System.out.println(StringTools.isNotEmpty("2 2"));

        //转换Null，如果字符串为空，转换为空串返回，否则返回原字符串
        System.out.println("\n4:");
        System.out.println(StringTools.convertNull(s));
        System.out.println(StringTools.convertNull(""));
        System.out.println(StringTools.convertNull("  "));
        System.out.println(StringTools.convertNull("2 2"));

        //换Null，如果字符串为空，使用target替换原字符串返回。否则返回原字符串
        System.out.println("\n5:");
        System.out.println(StringTools.convertNull(s, "haha"));
        System.out.println(StringTools.convertNull("", "haha"));
        System.out.println(StringTools.convertNull("  ", "haha"));
        System.out.println(StringTools.convertNull("2 2", "haha"));

        //转换Null，如果字符串为null，或者空字符串，返回0，否则返回原字符串的整数类型
        System.out.println("\n6:");
        System.out.println(StringTools.convertNullToNumber(s));
        System.out.println(StringTools.convertNullToNumber(""));
        System.out.println(StringTools.convertNullToNumber("33"));

        //判断相同代码是否出现2次以上
        s = "0012312312345";
        System.out.println("\n7:");
        System.out.println(StringTools.isSameCodeAppearsTwoTimes(s, "12"));

        //如果有相同代码，截取第一次出现的代码，到第二次出现的位置结束的字符串
        s = "0012312312345";
        System.out.println("\n8:");
        System.out.println(StringTools.substringSameCodeFirst(s, "123"));

        //如果有相同代码，截取第二次出现的代码开始一直到最后的字符串
        s = "001231231234545455";
        System.out.println("\n9:");
        System.out.println(StringTools.subStringSameCodeForLast(s, "0"));

        //如果有2次以上相同代码，截取最后一次出现的代码开始到最后的字符串
        s = "001231231234545455";
        System.out.println("\n10:");
        System.out.println(StringTools.subStringSameCodeForLastRecursion(s, "123"));

        //以相同代码分段，存入数组中返回
        s = "001231231234545455";
        System.out.println("\n11:");
        System.out.println(Arrays.toString(StringTools.substringSameCodeForStringArray(s, "12")) );

        //以相同代码分段，存入数组中返回
        s = "0-01,231-231,234-5,454-55";
        System.out.println("\n12:");
        System.out.println(Arrays.toString(StringTools.ConformingSeparation(s, ",")) );
        System.out.println(Arrays.toString(StringTools.ConformingSeparation(s, "-")) );

        //对象转小写字符串//对象转大写字符串
        Person p = new Person("Tom Smith.");
        System.out.println("\n13:");
        System.out.println(StringTools.objectConverLowerString(p));
        System.out.println(StringTools.objectConverUpperString(p));

        //将字符串数组拼接成字符串
        String[] strings = {"hello", ",", "world."};
        System.out.println("\n14:");
        System.out.println(StringTools.StringArrayConvertString(strings));

        //判断原字符串中是否有padding的内容，没有在左边进行拼接
        s = "world.";
        System.out.println("\n15:");
        System.out.println(StringTools.padLeft(s, "hello, "));

        // 判断原字符串中是否有padding的内容，没有在右边进行拼接
        s = "world.";
        System.out.println("\n16:");
        System.out.println(StringTools.padRight(s, "hello, "));
    }
}
