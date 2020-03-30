package thread.EvenChecker;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

public class EvenGenerator extends IntGenerator {
    private int currentEvenValue=0;

    @Override
    public int next() {
        //++currentEvenValue;
        //Thread.yield();
        ++currentEvenValue;
        return currentEvenValue;
    }

    public static void main(String[] args) throws InterruptedException {
        EvenGenerator e = new EvenGenerator();
        EvenChecker.test(e);
        TimeUnit.SECONDS.sleep(2);
        System.out.println("count"+e.getCount().size());
    }

    @Override
    public Map<Integer,Integer> getCount() throws InterruptedException {
        return super.getCount();
    }
}
