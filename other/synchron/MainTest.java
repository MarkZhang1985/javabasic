package other.synchron;

/**
 * @Auther: zhangkaiming
 * @Date: 2018/8/18
 * @Description:
 */
public class MainTest {


    public static void main(String[] args) {
//        MyThread thread1 = new MyThread("线程1");
//        MyThread thread2 = new MyThread("线程2");
//        MyThread thread3 = new MyThread("线程3");
//        thread1.start();
//        thread2.start();
//        thread3.start();

//        MyThread myThread = new MyThread();
//        Thread thread1 = new Thread(myThread, "线程1");
//        Thread thread2 = new Thread(myThread, "线程2");
//        Thread thread3 = new Thread(myThread, "线程3");
//        thread1.start();
//        thread2.start();
//        thread3.start();

//        for(int i = 0; i<3; i++){
//            Thread thread = new Thread(new MyThread(), "线程" + (i+1));
//            thread.start();
//        }

//        MyThread myThread = new MyThread();
//        for(int i = 0; i<3; i++){
//            Thread thread = new Thread(myThread, "线程" + (i+1));
//            thread.start();
//        }

//        Thread thread1 = new Thread(myThread, "线程1" );
//        Thread thread2 = new Thread(myThread, "线程2" );
//        Thread thread3 = new Thread(myThread, "线程3" );
//        thread1.start();
//        thread2.start();
//        thread3.start();

        Runnable runnable = new MyRunnalbe();
        Thread threadr1 = new Thread(runnable, "run1：");
        Thread threadr2 = new Thread(runnable, "run2：");
        threadr1.start();
        threadr2.start();

    }


}
