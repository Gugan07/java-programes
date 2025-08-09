import java.util.Scanner;
public class UserMain{
    public static void main(String[] args) {
        Scanner sc=new Scanner(system.In);
        Integer size=Integer.valueOf(sc.nextLine());
        User [] arr=new User[size];
        String id,name,address,phone_no;
        for(int i=0;i<size;i++){
            System.out.println("Enter user "+(i+1)+"details:");
            System.out.print("Enter User_id:");
            id=sc.nextLine();
            System.out.print("Enter User_name");
            name=sc.nextLine();
            System.out.print("Enter User_address");
            address=sc.nextLine();
            System.out.print("Enter phone_no");
            phone_no=sc.nextLine();
           u = New User(id, name,address,phone_no);
           arr[1]=u; 

        }
        for(user u1:arr){
            System.out.printLn(u1);
        }
    }
}