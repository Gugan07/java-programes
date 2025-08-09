import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Chario {
    public static void main(String args[]) throws IOException {
        char c;
        Character d;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        
        c = (char) br.read(); 
        
        d=br.readLine().charAt(0); 

        System.out.print("You entered: " + c+d);
    }
}
