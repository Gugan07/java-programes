import java.io.*;
import java.util.Scanner;
public class FileCounter {
    public static void main(String[] args) {
        int lines = 0, words = 0, characters = 0;

        try {
            File file = new File("sample.txt");
            Scanner sc = new Scanner(file);

            while (sc.hasNextLine()) {
                String line = sc.nextLine();
                lines++;
                characters += line.length();
                String[] wordArray = line.trim().split("\\s+");
                if (!line.trim().isEmpty()) {
                    words += wordArray.length;
                }
            }

            sc.close();
            System.out.println("Lines: " + lines);
            System.out.println("Words: " + words);
            System.out.println("Characters: " + characters);
        } catch (Exception e) {
            System.out.println("File not found");
        }
    }
}
