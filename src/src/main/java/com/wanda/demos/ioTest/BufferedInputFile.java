package com.wanda.demos.ioTest;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 * 读取文件的内容并返回
 *
 * @author ZhiFei
 */
public class BufferedInputFile {
    /**
     * 读取文件，参数为文件路径
     *
     * @param filename
     * @return
     * @throws IOException
     */
    public static String read(String filename) throws IOException {
        BufferedReader in = new BufferedReader(new FileReader(filename));
        String s;
        StringBuilder sb = new StringBuilder();
        while ((s=in.readLine())!=null){
            sb.append(s+"\n");
        }
        in.close();
        return sb.toString();
    }

    public static void main(String[] args) throws IOException {
        System.out.println(read("E:\\blog.zip"));
    }

}
