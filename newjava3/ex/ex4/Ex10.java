package newjava3.ex.ex4;

/**
 * @Auther: zhangkaiming
 * @Date: 2018/8/13
 * @Description:
 * 10、实现求解下面的式子的结果 s=1*2+2*3+3*4+…+20*21。
 */
public class Ex10 {
    public static void main(String[] args) {

        int sum = 0;
        System.out.print("s = ");
        for( int i = 1; i < 22; i++ ){
            if(i > 1) System.out.print(" + ");
            System.out.print(i + "*" + (i+1));
            sum += i*(i+1);
        }
        System.out.println("\nsum:" + sum);
    }
}
