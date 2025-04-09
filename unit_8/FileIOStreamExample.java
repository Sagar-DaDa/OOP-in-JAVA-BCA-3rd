package unit_8;

import java.io.*;

public class FileIOStreamExample {
    public static void main(String[] args) throws IOException {
        FileInputStream in = null;
        FileOutputStream out = null;

        try {
            in = new FileInputStream("unit_8/input.txt");
            out = new FileOutputStream("unit_8/output.txt");

            int c;
            while ((c = in.read()) != -1) {
                out.write(c);
            }
            System.out.println("File copied!");
        } catch (IOException ioException){
            System.out.println(ioException.getMessage());
        } finally {
            if (in != null) in.close();
            if (out != null) out.close();
        }
    }
}

