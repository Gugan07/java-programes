public class User{
    String user_id,user_name,user_address,phone_no;
    public Student(){}

    public Student(String id,String name,String address,String phone_no){
        this.user_id = id;
        this.user_namename = name;
        this.user_address = address;
        this.user_phone_no = phone_no;
    }
    public String getId() {
        return id;
    }
    public void setId(String id){
        this.id=id;
    }
     public String getname() {
        return name;
    }
    public void setname(String name){
        this.name = name;
    }
     public String getaddress() {
        return address;
    }
    public void setname(String address){
        this.address = address;
    }
     public String getphone_no() {
        return phone_no;
    }
    public void setname(String phone_no){
        this.phone_no = phone_no;
    }
   @ovverride
   public String toString() {
    
   }
}