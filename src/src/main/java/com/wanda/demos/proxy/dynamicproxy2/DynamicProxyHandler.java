package com.wanda.demos.proxy.dynamicproxy2;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;

/**
 * 代理类
 * @author ZhiFei
 */
public class DynamicProxyHandler implements InvocationHandler {
    private Object proxied;

    public DynamicProxyHandler(Object proxied) {
        this.proxied = proxied;
    }

    /**
     * @param proxy  被代理类实例
     * @param method 调用被代理类的方法
     * @param args   该方法需要的参数
     * @return
     * @throws InvocationTargetException
     * @throws IllegalAccessException
     */
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws InvocationTargetException, IllegalAccessException {
        System.out.println("**** proxy：" + proxy.getClass() + ". method：" + method + ". args：" + Arrays.toString(args));
        if (args != null) {
            // 遍历参数
            for (Object arg : args) {
                System.out.print("参数列表：");
                System.out.print(arg+" ");
            }
            System.out.println();
        }
        //将请求转发给被代理的对象
        return method.invoke(proxied, args);
    }
}
