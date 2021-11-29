package com.wanda.demos.thread;

/**
 * @author ZhiFei
 */
public class RealizeRunnableTest {

    public static void main(String[] args) {
        RealizeRunnable ir = new RealizeRunnable();
        RealizeRunnable ir1 = new RealizeRunnable();
        ir.run();
        ir1.run();
    }
}
