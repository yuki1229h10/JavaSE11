package chapter10.ex10;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Sample {
    public static void main(String[] args) {
        FileInputStream is = null;
        try {
            is = new FileInputStream("sample.txt");
            throw new FileNotFoundException();
        } catch (Exception e) {
            System.out.println("A");
        } finally {
            if (is != null) {
                try {
                    is.close();
                } catch (IOException e) {
                    throw new RuntimeException();
                }
            }
            System.out.println("B");
        }
    }
}
