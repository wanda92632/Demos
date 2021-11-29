package com.wanda.demos.thread;

/**
 * @author ZhiFei
 * 继承Threat类实现多线程
 */
public class InheritThreat extends Thread {
    protected int countDown=10;//Default
    private static int taskCount=0;
    private final int id = taskCount++;

    public InheritThreat(){}

    public String status(){
        return "#"+id+"("+(countDown>0?countDown:"end")+"),"+"priority:"+this.getPriority();
    }

    @Override
    public void run() {
        while (countDown-->0){
            System.out.println(status());
            System.out.println("ThreadName:"+Thread.currentThread().getName());
            Thread.yield();
        }
    }
}
