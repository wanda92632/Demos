package com.wanda.demos.thread;

/**
 * @author ZhiFei
 * 实现Runnable接口实现多线程
 */
public class RealizeRunnable implements Runnable {
    private String name;
    protected int countDown=100000;//Default
    private static int taskCount=0;
    private final int id = taskCount++;

    public RealizeRunnable(){}

    public RealizeRunnable(String name){
        this.name=name;
    }

    public String status(){
        return "#"+id+"("+(countDown>0?countDown:"end")+"),";
    }

    @Override
    public void run() {
        while (countDown-->0){
            System.out.print(status());
            try {
                Thread.sleep(100,100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
