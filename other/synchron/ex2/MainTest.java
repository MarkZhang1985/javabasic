package other.synchron.ex2;


/**
 * @Auther: zhangkaiming
 * @Date: 2018/8/18
 * @Description:
 */
public class MainTest {
    public static void main(String[] args) {
//        Thread thread1 = new Ticket();
//        Thread thread2 = new Ticket();
//        thread1.setName("一号");
//        thread2.setName("二号");
//        thread1.start();
//        thread2.start();

        AnotherTicket anotherTicket = new AnotherTicket();
        Thread thread3 = new Thread(anotherTicket, "三号");
        Thread thread4 = new Thread(anotherTicket, "四号");
        thread3.start();
        thread4.start();
    }
}
