import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader; 

public class Intio {
    public static void main(String args[]) throws IOException {
        int a;
        Integer b;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
        
        a = Integer.parseInt(br.readLine());
        

        System.out.println("a: " + a);
        
    }
}
