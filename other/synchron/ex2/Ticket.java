package other.synchron.ex2;

/**
 * @Auther: zhangkaiming
 * @Date: 2018/8/18
 * @Description:
 * 卖票，多个窗口同时卖票，票数为0时停止卖票。
 */
public class Ticket extends Thread{

    private static int ticketMax = 10;

    @Override
    public synchronized void run() {

        while (ticketMax > 0){
            try {
                Thread.sleep(200);
                if(ticketMax <=0)return;
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            ticketMax--;
            System.out.println("窗口" + this.getName() + "正在卖票，卖出1张。剩余" + ticketMax + "张。");
        }
    }
}
