package other.synchron.ex2;

/**
 * @Auther: zhangkaiming
 * @Date: 2018/8/18
 * @Description:
 */
public class AnotherTicket extends Thread{

    private int ticketMax = 10;

    @Override
    public void run() {

        while (ticketMax > 0){
            try {
                Thread.sleep(200);
                if(ticketMax <=0)return;
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            synchronized (this){
                ticketMax--;
                System.out.println("窗口" + Thread.currentThread().getName() + "正在卖票，卖出1张。剩余" + ticketMax + "张。");
            }
        }
    }
}
