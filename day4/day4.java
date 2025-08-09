import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class day4 {
    public static void main(String args[]) throws IOException {
        char c, d;
        int a;
        float b;

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Enter integer: ");
        a = Integer.parseInt(br.readLine());

        System.out.print("Enter character c: ");
        c = br.readLine().charAt(0);

        System.out.print("Enter float: ");
        b = Float.parseFloat(br.readLine());

        System.out.print("Enter character d: ");
        d = br.readLine().charAt(0);

        System.out.println("Output: " + a + " " + b + " " + c + " " + d);
    }
}
