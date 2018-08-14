package newjava4.ex1;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * @Auther: zhangkaiming
 * @Date: 2018/8/14
 * @Description:
 * 1.    禁止创建对象，并且该类不能被继承
 * 2.	static boolean isLowerChar (char c) 检测是否为小写字母 提示:小写字母范围97-122
 * 3.	static boolean isUpperChar (char c) 检测是否为大写字母 提示:大写字母范围65-91
 * 4.	static boolean isNumberChar (char c) 检测是否为数字 提示:数字范围48-57
 * 5.	static boolean isLetterChar (char c) 检测是否为字母
 * 6.	static char transformLowerChar (char c)
 * 将大写转为小写，如果不是字母或者本身为小写直接返回
 * 7.	static char transformUpperChar (char c)
 * 将小写转为大写，如果不是字母或者本身为大写直接返回
 * 8.	static char transformUpperOrLowerChar (char c)
 * 将大写转为小写，将小写转为大写，如果不在字母范围内，原样返回
 * 9.	static char getRandomLowerChar ()
 * 随机获取一个小写字母
 * 10.	static char getRandomUpperChar ()
 * 随机获取一个大写字母
 * 11.	static char [] getRandomCharArray ()
 * 随机获取一个字符数组，长度随机，总长度不能超过52，要求字符数组不能重复
 * 12.	static char [] getRandomCharArrayByNumber (int i)
 * 随机获取一个字符数组，长度为传入的值I,字符数组不能重复，i值不能超过52，出错提示
 * 13.	static char [] encryptCharArray (char [] chars)
 * 提示：通过位移的方式，将原数组中的char偏移固定个数后，生成新字符，并装入新字符数组返回
 * 14.	static char [] decryptCharArray (char [] chars)
 * 提示：通过位移的方式，将原数组中的char还原固定个数后，还原成旧字符，转入新字符数组返回
 */
public final class CharacterTools {

    //该类无法创建实例
    private CharacterTools() {
    }

    //检测是否为小写字母 提示:小写字母范围97-122
    public static boolean isLowerChar (char c){
        return c >= 97 && c <= 122;
    }

    //检测是否为大写字母 提示:大写字母范围65-91
    public static boolean isUpperChar (char c){
        return c >= 65 && c <= 91;
    }

    //检测是否为数字 提示:数字范围48-57
    public static boolean isNumberChar (char c){
        return c >=48 && c <= 57;
    }

    //检测是否为字母
    public static boolean isLetterChar (char c){
        return ( c >= 65 && c <= 91 ) || ( c >= 97 && c <= 122 );
    }

    //将大写转为小写，如果不是字母或者本身为小写直接返回
    public static char transformLowerChar (char c){
        return isUpperChar(c) ? (char) (c + 32) : c;
    }

    //将小写转为大写，如果不是字母或者本身为大写直接返回
    public static char transformUpperChar (char c){
        return isLowerChar(c) ? (char) (c - 32) : c;
    }

    //将大写转为小写，将小写转为大写，如果不在字母范围内，原样返回
    public static char transformUpperOrLowerChar (char c){
        if (isUpperChar(c)) return transformUpperChar(c);
        return  transformLowerChar(c);
    }

    //随机获取一个小写字母
    public static char getRandomLowerChar (){
        return (char)( (new Random()).nextInt(26) + 97 );
    }

    //随机获取一个大写字母
    public static char getRandomUpperChar (){
        return (char)( (new Random()).nextInt(26) + 65 );
    }

    //生成一个存取大小写字母的集合
    private static List<Character> getLetterArrayList(){
        List<Character> original = new ArrayList<>();
        for(char c = 'A'; c <='Z'; c++) original.add(c);
        for(char c = 'a'; c <= 'z'; c++) original.add(c);
        return original;
    }

    //随机获取一个字符数组，长度随机，总长度不能超过52，要求字符数组不能重复
    public static char [] getRandomCharArray (){
        //建立英文字母数组
        List<Character> original = getLetterArrayList();

        //建立结果字母数组
        Random random = new Random();
        int length = random.nextInt(53);//随机长度，不超过52
        char[] results = new char[length];

        for(int i = 0; i < results.length; i++){
            int re = random.nextInt(original.size());//在英文数组中取得随机值
            results[i] = original.get(re);//加入结果数组
            original.remove(re);//从英文数组中移除
        }
        return results;
    }

    //随机获取一个字符数组，长度为传入的值I,字符数组不能重复，ç，出错提示
    public static char [] getRandomCharArrayByNumber (int length){
        //判断参数是否合法
        if(length > 53 || length < 0){
            System.out.println("参数非法，取值范围[0, 52]。");
            return null;
        }

        //建立英文字母数组
        List<Character> original = getLetterArrayList();

        //建立结果字母数组
        Random random = new Random();
        char[] results = new char[length];

        for(int i = 0; i < results.length; i++){
            int re = random.nextInt(original.size());//在英文数组中取得随机值
            results[i] = original.get(re);//加入结果数组
            original.remove(re);//从英文数组中移除
        }
        return results;
    }

    //通过位移的方式，将原数组中的char偏移固定个数后，生成新字符，并装入新字符数组返回
    public static char [] encryptCharArray (char [] chars){
        //位移模式，字符+固定长度生成新字符
        int step = 5;

        char[] results = new char[chars.length];
        for(int i = 0; i < chars.length; i++){
            results[i] = (char)(chars[i] + step);
        }

        return results;
    }

    //通过位移的方式，将原数组中的char还原固定个数后，还原成旧字符，转入新字符数组返回
    public static char [] decryptCharArray (char [] chars){
        //位移模式，字符+固定长度生成新字符
        int step = 5;

        char[] results = new char[chars.length];
        for(int i = 0; i < chars.length; i++){
            results[i] = (char)(chars[i] - step);
        }

        return results;
    }

}
