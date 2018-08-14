package newjava4.ex1;
import org.junit.Test;

/**
 * @Auther: zhangkaiming
 * @Date: 2018/8/14
 * @Description:
 */
public class TestMethod {


    @Test
    public void test(){

        System.out.println(CharacterTools.isLowerChar('1'));
        System.out.println(CharacterTools.isLowerChar('a'));

        System.out.println(CharacterTools.isUpperChar('T'));
        System.out.println(CharacterTools.isUpperChar('1'));

        System.out.println(CharacterTools.isLetterChar('1'));
        System.out.println(CharacterTools.isLetterChar('A'));

        System.out.println(CharacterTools.transformLowerChar('B'));
        System.out.println(CharacterTools.transformLowerChar('1'));

        System.out.println(CharacterTools.transformUpperChar('c'));
        System.out.println(CharacterTools.transformUpperChar('1'));

        System.out.println(CharacterTools.getRandomLowerChar());

        //getRandomCharArray()
        char[] chars = CharacterTools.getRandomCharArray();
        System.out.println("length: " + chars.length);
        System.out.println(chars);

        //getRandomCharArrayByNumber(int length)
        chars = CharacterTools.getRandomCharArrayByNumber(30);
        if(chars != null) {
            System.out.println("length: " + chars.length);
            System.out.println(chars);
        }

        //encryptCharArray(chars)、decryptCharArray(chars)
        if(chars != null) {
            char[] encryptChars = CharacterTools.encryptCharArray(chars);
            System.out.println("encryptChars length: " + encryptChars.length);
            System.out.println(encryptChars);

            char[] decryptChars = CharacterTools.decryptCharArray(encryptChars);
            System.out.println("decryptChars length: " + decryptChars.length);
            System.out.println(decryptChars);
        }

    }
}
