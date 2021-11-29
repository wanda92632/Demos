package com.wanda.demos.thread;

import java.util.concurrent.Callable;

/**
 * @author ZhiFei
 * 从任务中产生返回值
 */
public class TaskWithResult implements Callable<String> {
    private int id;
    public TaskWithResult(int id){
        this.id=id;
    }

    @Override
    public String call() {
        return "result of TaskWithResult"+id;
    }
}
