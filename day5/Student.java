public class Student {
    Integer id;
    String name;
    public Student(){}

    public Student(Integer id,String name){
        this.id = id;
        this.name = name;
    }
    public Integer getId() {
        return id;
    }
    public void setId(Integer id){
        this.id=id;
    }
     public String getname() {
        return name;
    }
    public void setname(String name){
        this.name = name;
    }

}