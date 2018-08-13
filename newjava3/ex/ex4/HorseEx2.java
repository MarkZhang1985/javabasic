package newjava3.ex.ex4;

/**
 * @Auther: zhangkaiming
 * @Date: 2018/8/13
 * @Description:2、有一百担粮食，一只大马驼3担，一只中马驼2担，两只小马驼1担，
 * 正好一百匹马，大马多少只，中马多少只，小马多少只。
 */
public class HorseEx2 {
    public static void main(String[] args) {

        int food = 100;
        int horse = 100;
        int big, middle, small;

        for(big = 0; big*3<=food; big++)
            for(middle = 0; middle*2<=food; middle++)
                for(small = 0; small/2<=food; small++){
                    //加上小马是2的倍数的条件。
                    if(big + middle + small  == horse && big*3 + middle*2 + small/2 == food && small%2 == 0)
                        System.out.println("大马：" + big + "\t中马：" + middle + "\t小马：" + small);
                }
    }
}
