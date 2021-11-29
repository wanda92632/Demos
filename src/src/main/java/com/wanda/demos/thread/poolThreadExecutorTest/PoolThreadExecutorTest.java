package com.wanda.demos.thread.poolThreadExecutorTest;

import java.sql.Time;
import java.util.concurrent.*;

public class PoolThreadExecutorTest {
    public static void main(String[] args) {
        ThreadPoolExecutor executor = createThreadPoolExecutor();

    }

    public static ThreadPoolExecutor createThreadPoolExecutor(){
        int corePoolSize = 0;
        int maximumPoolSize =Integer.MAX_VALUE;
        long keepAliveTime =60;
        TimeUnit unit = TimeUnit.SECONDS;
        BlockingQueue<Runnable> workQueue = new SynchronousQueue<>();
        RejectedExecutionHandler handler = new MyIgnorPolicy();
        ThreadPoolExecutor executor = new ThreadPoolExecutor(corePoolSize,maximumPoolSize,keepAliveTime,unit,workQueue,Executors.defaultThreadFactory(),new ThreadPoolExecutor.AbortPolicy());
        return executor;
    }
}
