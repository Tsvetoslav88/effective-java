package chapter2.item9.tryfinally;

import java.io.*;

public class Copy {

    private static final int BUFFER_SIZE = 8 * 1024;

    // try-finally is ugly when used with more than one resource! (Page 34)
    static void copy(String src, String dest) throws IOException {
        InputStream inputStream = new FileInputStream(src);
        try {
            OutputStream outputStream = new FileOutputStream(dest);
            try {
                byte[] buf = new byte[BUFFER_SIZE];
                int n;
                while ((n = inputStream.read(buf)) >= 0)
                    outputStream.write(buf, 0, n);
            }finally {
                outputStream.close();
            }
        }finally {
            inputStream.close();
        }
    }

    public static void main(String[] args) throws IOException {
        String src = args[0];
        String dst = args[1];
        copy(src, dst);
    }

}
