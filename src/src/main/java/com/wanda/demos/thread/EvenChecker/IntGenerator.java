package thread.EvenChecker;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;
import java.util.Queue;

public abstract class IntGenerator {
    private volatile boolean canceled = false;
    private Integer id = 0;
    private Map<Integer,Integer> map= new HashMap<>();
    public  abstract int next();

    public void cancel() {
        canceled = true;
    }

    public boolean isCanceled() {
        return canceled;
    }


    public synchronized Map<Integer,Integer> getCount() throws InterruptedException {
        return map;
    }

    public synchronized void setId(int id) {
        this.id = id;
    }

    public void addId() {
        id++;
        map.put(id,id);
        System.out.println(id);
    }
}
