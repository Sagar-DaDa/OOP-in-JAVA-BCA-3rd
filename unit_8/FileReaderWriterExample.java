package unit_8;

import java.io.*;

public class FileReaderWriterExample {
    public static void main(String[] args) throws IOException {
        FileReader in = null;
        FileWriter out = null;

        try {
            in = new FileReader("unit_8/input.txt");
            out = new FileWriter("unit_8/output.txt");

            int c;
            while ((c = in.read()) != -1) {
                out.write(c);
            }

            System.out.println("File copied!");
        } finally {
            if (in != null) in.close();
            if (out != null) out.close();
        }
    }
}

