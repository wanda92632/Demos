package thread.EvenChecker;


import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class EvenChecker implements Runnable {
    private IntGenerator generator;
    private final int id;

    public EvenChecker(IntGenerator g, int ident) {
        generator = g;
        id = ident;
    }

    @Override
    public void run() {
        //值为false则进入循环
//        while (!generator.isCanceled()) {
//            //canceled值为false时,所有线程都进入了循环,但if语句条件的值恒为false,无法该改变canceled值,则一直进行死循环
//            int val = generator.next();
//            if (val % 2 != 0) {
//                System.out.println(val + "not even!");
//                //改变canceled值,则后面的线程不可能进入
//                generator.cancel();
//            }
//        }
        //System.out.println(generator.getId());
        generator.addId();
    }

    public static void test(IntGenerator gp, int count) {
        System.out.println("Press Control-C to exit");
        //ThreadPoolExecutor executor = PoolThreadExecutorTest.createThreadPoolExecutor();
        ExecutorService exec = Executors.newCachedThreadPool();
        for (int i = 0; i < count; i++) {
            exec.execute(new EvenChecker(gp, i));
        }
        exec.shutdown();
    }

    public static void test(IntGenerator gp) {
        test(gp, 10);
    }
}
