package proxy.dynamicproxy2;

/**
 * 实现代理接口
 *
 * @author ZhiFei
 */
public class RealObject implements Interface {

    @Override
    public void doSomething() {
        System.out.println("doSomething");
    }

    @Override
    public void somethingElse(String arg) {
        System.out.println("somethingElse "+arg);
    }
}
