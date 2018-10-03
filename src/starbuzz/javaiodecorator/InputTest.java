package starbuzz.javaiodecorator;

import java.io.*;

public class InputTest {
    private static final String TEST_FILE = "D:\\Production\\Software\\IdeaProjects\\DesignPatterns\\src\\starbuzz\\javaiodecorator\\test.txt";
    public static void main(String[] args) {
        int c;

        try {
            // Decoration (Wrapping) taking place.
            InputStream in = new LowerCaseInputStream(new BufferedInputStream(new FileInputStream(TEST_FILE)));

            while((c = in.read()) >= 0) {
                System.out.print((char)c);
            }

            in.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
