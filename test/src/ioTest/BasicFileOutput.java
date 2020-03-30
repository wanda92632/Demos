package ioTest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.StringReader;

/**
 * @author ZhiFei
 */
public class BasicFileOutput {
    static String file = "BasicFileOutput.out";
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new StringReader(BufferedInputFile.read("BasicFileOutput.java")));
    }
}
