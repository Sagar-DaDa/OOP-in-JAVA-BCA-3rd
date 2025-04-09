package unit_8;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

class BufferedReaderExample {
    public static void main(String[] args) throws IOException {
        FileReader fr = new FileReader("unit_8/input.txt");
        BufferedReader br = new BufferedReader(fr);

        char[] c = new char[20];

        if (br.markSupported()) {
            System.out.println("mark() method is supported");
            br.mark(100);
        }

        br.skip(8); // Skips first 8 characters

        if (br.ready()) {
            // Reads and prints one line
            System.out.println(br.readLine());
        }

        br.read(c); // Reads into char array
        for (int i = 0; i < 20; i++) {
            System.out.print(c[i]);
        }

        System.out.println();
        br.reset(); // Resets to marked position

        for (int i = 0; i < 8; i++) {
            System.out.print((char) br.read()); // Reads and prints 8 characters
        }

        br.close();
    }
}

