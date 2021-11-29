package com.wanda.demos.proxy.staticproxy;

/**
 * @author ZhiFei
 */
public class ProxyTest1 {
    public static void main(String[] args) {
        Candidate c = new Gunman(new LazyStudent("王小二"));
        c.answerTheQuestions();
    }
}
