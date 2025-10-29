public class Vehicle{
    Integers  noOfTyres;
    INtegers  noOfGears;

    public Vechicle(Integer noOfGreas, Integers noOfTyres){
        this.noOfGears = noOfGears;
        this.noOfTyres = noOfTyres;
    }
    public void start(){
        System.out.println(x:"Vehicle Started");
    }
    public void stop(){
        System.out.println(x:"Vechicle stop");
    }
    public void displayVehicle(){
        System.out.println("Number of Gears: " + noOfGears);
        System.out.println("Number of Tyres: " + noOfTyres);
    }
}