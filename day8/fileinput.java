import java.io.*;
import java.util.Scanner;
class Fileinput {
    public static void main(String[] args) {
        File file =new File("sample.tx");
       
        try{
            Scanner sc=new Scanner(file);
            while(sc.hasNext()){
                String str=sc.nextLine();
                System.out.println(str);
            }
        }
        catch(Exception e){

        }

    }
}