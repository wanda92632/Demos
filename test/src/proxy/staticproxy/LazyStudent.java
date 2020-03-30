package proxy.staticproxy;

/**
 * 实现类
 *
 * @author ZhiFei
 */
public class LazyStudent implements Candidate {
    /**
     * 姓名
     */
    private String name;

    public LazyStudent(String name){
        this.name=name;
    }

    /**
     * 答题
     */
    @Override
    public void answerTheQuestions() {
        //懒学生只能写出自己的名字不会答题
        System.out.println("姓名："+name);
    }
}
