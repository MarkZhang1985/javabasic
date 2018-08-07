package newjava3.ex.ex3.ex9;

import java.util.Arrays;

/**
 * @Auther: zhangkaiming
 * @Date: 2018/8/7
 * @Description:
 * 9. 假设有一根绳子，上面有一些红、白、蓝色的旗子。起初旗子的顺序是任意的，
 * 现在要求用最少的次数移动这些旗子，使得它们按照蓝、白、红的顺序排列。
 * 注意只能在绳子上操作，并且一次只能调换两个旗子。
 */
public class Rope {

    public static void main(String[] args) {
        char[] origin = {'蓝', '白', '红', '绿', '紫', '黑', '黄'};
        char[] rope = {'黑', '红', '黄', '蓝', '白', '紫', '绿'};
        char temp;
        int step = 0;
        //分三种情况，
        // 1、位置都正确，不用交换。
        // 2、两个位置不正确，则互相交换。
        // 3、位置都不正确，则把第一个元素移动到正确位置，剩下的交换。
        // 类似于乱序数组从大到小排列
        System.out.println("origin:" + Arrays.toString(origin));
        System.out.println("rope:" + Arrays.toString(rope));
        for(int i = 0; i<origin.length; i++){//把原数组作为标志数组，发现何其位置不相符的，进行对调
            for(int j = i; i<rope.length; j++){//外循环每比较一次，便排好一个元素，所以从第i个元素开始进行本轮比较
                if(origin[i] == rope[j]){//找到元素的正确位置，为j，进行交换
                    if(i == j)break;//本轮元素在其正确位置，跳出循环
                    step++;
                    System.out.println("第" + step + "步：" + rope[i] + "-->" + rope[j]);
                    temp = rope[j];
                    rope[j] = rope[i];
                    rope[i] = temp;
                    //System.out.println(Arrays.toString(rope));
                    break;
                }
            }
        }
        System.out.println("sorted rope:" + Arrays.toString(rope));

    }
}
