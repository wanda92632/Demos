package com.wanda.demos.proxy.dynamicproxy2;

import java.lang.reflect.Proxy;

/**
 * @author ZhiFei
 */
public class SimpleDynamicProxy {

    /**
     * 调用接口的两个方法
     *
     * @param iface
     */
    public static void consumer(Interface iface){
        iface.doSomething();
        iface.somethingElse("bonobo");
    }

    public static void main(String[] args) {
        RealObject real = new RealObject();
        System.out.println("一般调用");
        consumer(real);
        System.out.println("动态代理");
        // 类加载器，被代理类的接口数组，调用处理器类的对象实例（对象实例）
        Interface proxy = (Interface) Proxy.newProxyInstance(Interface.class.getClassLoader(),new Class[]{Interface.class},new DynamicProxyHandler(real));
        System.out.println("调用 doSomething");
        proxy.doSomething();
        System.out.println("调用 somethingElse");
        proxy.somethingElse("bonobo");
    }
}
