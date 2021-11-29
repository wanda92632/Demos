package com.wanda.demos.jianzhiOffer;

import java.util.Stack;

/**
 * 用两个栈实现队列
 *
 * @author ZhiFei
 */
public class Stack_9<T> {
    private Stack<T> s1;
    private Stack<T> s2;
    public Stack_9(){
        s1 = new Stack<>();
        s2 = new Stack<>();
    }
    public void add(T t){
        s1.push(t);
    }

    public T pool(){
        if (s2.empty()){
            while (!s1.empty()){
                s2.push(s1.pop());
            }
        }
        return s2.pop();
    }

    public static void main(String[] args) {
        Stack_9<Integer> stack9 = new Stack_9<>();
        for (int i=0;i<10;i++){
            stack9.add(i);
        }
        for (int i=0;i<10;i++){
            System.out.println(stack9.pool());
        }
    }
}
