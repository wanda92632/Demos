package com.wanda.demos.jianzhiOffer;

/**
 * 单例模式
 * @author ZhiFei
 */
public class Singleton {
    private String name = "万达";
    private static Singleton singleton = new Singleton();
    private Singleton(){}

    //饿汉式
    public static Singleton getInstance(){
        return  singleton;
    }

    //懒汉式
}

class Singleton2 {
    private String name = "万达";
    private static Singleton2 singleton = null;
    private Singleton2(){}

    /**
     * 饿汉式
     *
     * @return
     */
    public static synchronized Singleton2 getInstance(){
        if(singleton==null){
            singleton=new Singleton2();
        }
        return  singleton;
    }

    //懒汉式
}
