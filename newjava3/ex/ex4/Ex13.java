package newjava3.ex.ex4;

/**
 * @Auther: zhangkaiming
 * @Date: 2018/8/13
 * @Description:
 * 13、算式:?2*7?=3848中缺少一个十位数和一个个位数。
 * 编程求出使该算式成立时的这两个数,并输出正确的算式。
 */
public class Ex13 {
    public static void main(String[] args) {
        System.out.println("?2*7?=3848");
        for(int i = 1; i < 10; i++)
            for(int j = 0; j < 10; j++)
                if( (i*10+2)*(70+j) == 3848) System.out.println(i+"2*7"+j+"=3848");
    }
}
