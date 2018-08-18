package other.synchron;

/**
 * @Auther: zhangkaiming
 * @Date: 2018/8/18
 * @Description:
 */
public class MyRunnalbe implements Runnable {

    private static int a = 10;

    @Override
    public void run() {
        while (a > 0) {
            try {
                Thread.sleep(100);
                if(a <= 0)break;
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            synchronized (this){
                a--;
                System.out.println("MyRunnable: running... a="+a);
            }
        }
    }
}
