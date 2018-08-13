package newjava3.ex.ex4;

/**
 * @Auther: zhangkaiming
 * @Date: 2018/8/7
 * @Description:
 * 1、公鸡每只5文，母鸡每只3文，雏鸡3只1文，100文钱买100只鸡，
 * 有公鸡多少只，母鸡多少只，雏鸡多少只。
 */
public class ChickenEx1 {
    public static void main(String[] args) {
        int money = 100;
        int cock, hen, chick;
        for(cock = 0; cock <= money / 5; cock++)
            for(hen = 0; hen <= money / 3; hen++)
                for(chick = 0; chick / 3 <= money; chick++)
                    //满足3个条件：小鸡个数是3的倍数、鸡的总价100、鸡的总个数100；
                    if (chick % 3 == 0 && cock * 5 + hen * 3 + chick / 3 == money && cock + hen + chick == 100)
                            System.out.println("cock:" + cock + "  hen:" + hen + "  chick:" + chick);

    }
}
