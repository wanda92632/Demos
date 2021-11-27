package ioTest;

import java.io.File;
import java.io.FilenameFilter;
import java.util.regex.Pattern;

/**
 *
 * @author ZhiFei
 */
public class DirList {
    public static void main(String[] args) {
        //通过将给定路径名字符串转换为抽象路径名来创建一个新 File 实例
        File path = new File("C:\\Users\\ZhiFei\\Downloads\\chrmoe");
        String [] list;
        //遍历输入的内容，这里没有
        for (Object x : args){
            System.out.println(x+"A");
        }

        list=path.list(new DirFilter("\\d+A+\\D+\\d+\\D+"));

//        if(args.length!=0){
//            //返回一个字符串数组，这些字符串指定此抽象路径名表示的目录中的文件名和目录名
//            list=path.list();
//        }else {
//            list=path.list(new DirFilter("\\D+\\D?"));
//        }

        for (String dirItem : list){
            System.out.println(dirItem);
        }
    }

    static class DirFilter implements FilenameFilter{
        private Pattern pattern;
        DirFilter(String regex){
            pattern=Pattern.compile(regex);
        }

        @Override
        public boolean accept(File dir, String name){
            return pattern.matcher(name).matches();
        }
    }
}
