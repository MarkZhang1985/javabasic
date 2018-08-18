package other.synchron.ex1;


/**
 * @Auther: zhangkaiming
 * @Date: 2018/8/18
 * @Description:
 * 1、生产销售程序，生产一直进行，达到库存时停止，销售一直进行，库存为0时停止销售。
 */
public class productAndSale {

    private static int stroe = 0;//库存

    public void product() throws InterruptedException {
        if(stroe > 9){
            System.out.println("库存达到上限10。");
            return;
        }
        System.out.println("商品生产中。。。");
        Thread.sleep(500);
        stroe++;
        System.out.println("生产了一个产品。");
    }

    public void sale(){
        if(stroe < 1){
            System.out.println("库存为0，请等待商品生产。");
            return;
        }
        System.out.println("购买商品1个。");
        stroe--;
    }
}
