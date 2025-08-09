import java.util.*;  

class Student {
    int rollno;
    String name;
    int[] marks = new int[3];
    int total;

    Student(int rollno, String name, int mark1, int mark2, int mark3) {
        this.rollno = rollno;
        this.name = name;
        this.marks[0] = mark1;
        this.marks[1] = mark2;
        this.marks[2] = mark3;
        this.total = mark1 + mark2 + mark3;
    }
}

public class StudentRanking {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);  
        int n = sc.nextInt();

        List<Student> students = new ArrayList<>();  
        for (int i = 0; i < n; i++) {
            int rollNo = sc.nextInt();
            String name = sc.next();
            int mark1 = sc.nextInt();
            int mark2 = sc.nextInt();
            int mark3 = sc.nextInt();
            students.add(new Student(rollNo, name, mark1, mark2, mark3));
        }
        students.sort((a, b) -> b.total - a.total);

        int rank = 1;
        for (Student s : students) {
            System.out.println("Rank: " + rank + " | Roll No: " + s.rollno +
                               " | Name: " + s.name + " | Total: " + s.total);
            rank++;
        }

        sc.close();  
    }
}



