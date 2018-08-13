package newjava3.ex.ex4;

/**
 * @Auther: zhangkaiming
 * @Date: 2018/8/13
 * @Description:
 * 3、纸的厚度0.125毫米，珠穆朗玛峰的高度为8848米，将纸对折多少次后，可以达到珠穆朗玛峰的高度。
 */
public class PaperEx3 {
    public static void main(String[] args) {
        double original = 0.125;//毫米
        double target = 8848*1000;//米

        int foldingTimes = 0;
        while (true){
            if( original * Math.pow(2, foldingTimes) - target >=0) break;
            foldingTimes++;
        }
        System.out.println("total times: " + foldingTimes);
    }
}
