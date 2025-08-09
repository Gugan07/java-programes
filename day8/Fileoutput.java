import java.io.*;
public class Fileoutput {
    public static void main(String[] args) {
        try {
            FileWriter fw = new FileWriter("input.txt", true); 
            PrintWriter pw = new PrintWriter(fw);
            pw.println("Welcome to Java programming");
            pw.println("Java is a very interesting language");

            pw.close(); 

        } catch (Exception e) {
            System.out.println("File not found");
        }
    }
}
