class Student{
        Int id;
	    String name;
	    String collegeName;
	
	    public Student(){
	
	    }
	
	    public Student(Integer id,String name,String collegeName){
	        this.id = id;
	        this.name = name;
	        this.collegeName = collegeName;
	    }
	
	    public void display(){
	        System.out.println("Student Details");
	        System.out.println("Id "+this.id);
	        System.out.println("Name "+this.name);
	        System.out.println("College Name "+this.collegeName);
	
	    }
	}