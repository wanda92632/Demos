package proxy.staticproxy;

/**
 * 代理类
 *
 * @author ZhiFei
 */
public class Gunman implements Candidate {
    private Candidate target;

    public Gunman(Candidate target){
        this.target=target;
    }

    /**
     * 答题
     */
    @Override
    public void answerTheQuestions() {
        //枪手要写上代考学生的姓名
        target.answerTheQuestions();
        //枪手要帮助协懒学生答题并答卷
        System.out.println("奋笔疾书正确答案");
        System.out.println("交卷");
    }
}
