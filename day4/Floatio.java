import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader; 

public class Floatio {
    public static void main(String args[]) throws IOException {
        float a;
        float b;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
        
        a = Float.parseFloat(br.readLine());
        b = Float.parseFloat(br.readLine());
        

        System.out.println("a: " + a);
        System.out.println("b: "+ b);
        
    }
}
