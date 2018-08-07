package newjava3.ex.ex3.ex7;

/**
 * @Auther: zhangkaiming
 * @Date: 2018/8/7
 * @Description:
 * 7.生成三个字符串类型的数组，第一个数组中手动存入代表名字的字符串10个，
 * 第二个数组存入代表地点的字符串15个，第三个数组存入代表行为的字符串12个，
 * 使用生成随机数的方法Math.random()来随机拼接句子。
 * 例Math.random()会生成一个double类型的数字0-1之间。
 */
public class RandomMatching {

    public static void main(String[] args) {
        String[] name = {"高一", "刘二", "张三", "李四", "王二麻子",
                "东方朔", "刘伯温", "哈利波特", "钢铁侠", "关羽"};
        String[] location = {"操场", "便利店", "车站", "公司", "地铁",
                "金字塔", "尼泊尔", "月球", "珠穆朗玛峰", "湖边",
                "浅草寺", "青瓦台", "白宫", "爱琴海", "撒哈拉"};
        String[] behavior = {"跳舞", "吃碗面", "上厕所", "怒吼", "沉思",
                "睡觉", "打电话", "敲代码", "洗澡", "自嗨",
                "弹钢琴", "点外卖"};

        for(int i = 0; i < 10; i++) {
            System.out.print(name[(int) (Math.random() * name.length)]);
            System.out.print("在");
            System.out.print(location[(int) (Math.random() * location.length)]);
            System.out.print(behavior[(int) (Math.random() * behavior.length)]);
            System.out.println();
        }

    }






}
