package thread;

/**
 * @author ZhiFei
 */
public class InheritThreatTest {
    public static void main(String[] args) {
        //将实现了Runnable接口的类提交给Thread构造器
//        Thread thread = new Thread(new RealizeRunnable());
//        Thread thread1 = new Thread(new RealizeRunnable());
//        thread.start();
//        thread1.start();
        //继承Thread类,实现run方法
        InheritThreat it = new InheritThreat();
        InheritThreat it1 = new InheritThreat();
        it.start();
        System.out.println("it:name"+it.getName());

        it1.start();
        System.out.println("it1:name"+it1.getName());
    }
}
