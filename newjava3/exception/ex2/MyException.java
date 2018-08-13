package newjava3.exception.ex2;

/**
 * @Auther: zhangkaiming
 * @Date: 2018/8/13
 * @Description:
 */
public class MyException extends Exception {

    class LowAgeException{
        String message;

        public LowAgeException(int age) {
            this.message = "年龄小于18岁。"+"(" + age + ")";
        }


    }
}
