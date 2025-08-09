class A{
    static Integer num1 = 10;
    Integer num2 = 20;
    static{
        System.out.println("Hi From Static Block");
    }
    public A(){
        System.out.println("Hai From Constructor A");
    }
}

class B{
    public B()
    {
        System.out.println("Hi From Consructor B");
    }
    public static void display() {
        System.out.println("Hi From Display Method From B");
    }
}

public class StaticClassExample {
    public static void main(String[] args) {
        System.out.println("Creating Object For A");
        A a = new A();
        B.display();
    }
}