class One {
    public void display() {
        System.out.println("display method in One");
    }
}

class Two {
    public void display() {
        System.out.println("display method in Two");
    }
}

 class day2 {
    public static void main(String[] args) {
        One one= new One();
        Two two = new Two();

        one.display();  
        two.display();  

        System.out.println("String "+args[0]);
        System.out.println("Integer "+Integer.parseInt(args[1]));
    }
}
