package thread.poolThreadExecutorTest;

import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.ThreadPoolExecutor;

public class MyIgnorPolicy implements RejectedExecutionHandler {
    @Override
    public void rejectedExecution(Runnable r, ThreadPoolExecutor executor) {
        doLog(r,executor);
    }

    private void doLog(Runnable r, ThreadPoolExecutor executor) {
        System.out.println(r.toString()+"rejected");
    }
}
