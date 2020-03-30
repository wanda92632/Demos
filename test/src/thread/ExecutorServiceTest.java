package thread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @author ZhiFei
 */
public class ExecutorServiceTest {
    public static void main(String[] args) {
        ExecutorService exec = Executors.newCachedThreadPool();
        for(int i=0;i<2;i++){
            exec.execute(new RealizeRunnable());
        }
    }
}
