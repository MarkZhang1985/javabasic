package newjava3.ex.ex4;

/**
 * @Auther: zhangkaiming
 * @Date: 2018/8/13
 * @Description:
 * 9、求 1-3+5-7+……-99+101 的值。
 */
public class Ex9 {
    public static void main(String[] args) {
        int sum = 0;
        boolean flag = true;//true：正数 false：负数
        for(int i = 1; i <=101; i++){
            if(i == 1){
                sum += i;
                System.out.print(i);
            }
            if(i>1){
                if(flag) {
                    sum += i;
                    System.out.print(" + ");
                }
                else {
                    sum -= i;
                    System.out.print(" - ");
                }
                System.out.print(i);
            }
            flag = !flag;

        }
        System.out.println("\nsum: " + sum);
    }
}
