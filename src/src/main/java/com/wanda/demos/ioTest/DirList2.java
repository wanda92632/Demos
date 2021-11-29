package com.wanda.demos.ioTest;

import java.io.File;
import java.io.FilenameFilter;
import java.util.regex.Pattern;

public class DirList2 {
    public static FilenameFilter filer(final String regex){
        return new FilenameFilter(){
            private Pattern pattern = Pattern.compile(regex);
            @Override
            public boolean accept(File dir,String name){
                return pattern.matcher(name).matches();
            }
        };
    }
    public static void main(String[] args){
        //通过将给定路径名字符串转换为抽象路径名来创建一个新 File 实例
        File path = new File("C:\\Users\\ZhiFei\\Downloads\\chrmoe");
        String [] list;
        //遍历输入的内容，这里没有
        for (Object x : args){
            System.out.println(x+"A");
        }
        String regex = "\\d+A+\\D+\\d+\\D+";
        list=path.list(filer(regex));
        for (String dirItem : list){
            System.out.println(dirItem);
        }
    }
}
