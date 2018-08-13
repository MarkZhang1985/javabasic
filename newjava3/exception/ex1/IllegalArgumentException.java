package newjava3.exception.ex1;

/**
 * @Auther: zhangkaiming
 * @Date: 2018/8/13
 * @Description:
 * 写一个方法void triangle(int a,int b,int c)，判断三个参数是否能构成一个三角形。
 * 如果不能则抛出异常IllegalArgumentException，显示异常信息：a,b,c “不能构成三角形”；
 * 如果可以构成则显示三角形三个边长。在主方法中得到命令行输入的三个整数，调用此方法，并捕获异常。
 * a<b<c
 * 两边之和大于第三边：a+b>c
 * 两边之差小于第三边：c-b<a
 */
public class IllegalArgumentException extends Exception{

    private String message;

    public IllegalArgumentException(int a, int b, int c) {
        this.message = "不能组成三角形。"  + "\ta：  " + a + "\tb：  " + b + "\tc：  " + c;
    }

    @Override
    public String getMessage() {
        return message;
    }
}
