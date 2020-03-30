package thread.poolThreadExecutorTest;

public class MyTask implements Runnable {
    private String name;

    public MyTask(){

    }
    public MyTask(String name){
        this.name=name;
    }
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName());
    }
}
