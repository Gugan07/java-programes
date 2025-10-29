public class Car extends Vehicle{
    boolean ac;
    String color;

    public Car (boolean ac, String color, Integer noOfGears, Integer noOfTyres){
        super(noOfGears, noOfTyres);
        this.ac = ac;
        this.color = color;
    }
    public boolean hasAC(){
        return ac;
    }
    public boolean getAC(){
        return ac;
    }
    public String getColor(){
        return color;
    }
    public void setColor(String color){
        this.color = color;
    }

    public void displayCar(){
        System.out.println("Car Color: " + color);
        System.out.println("Has AC: " + ac);
        displayVehicle();
    }
}