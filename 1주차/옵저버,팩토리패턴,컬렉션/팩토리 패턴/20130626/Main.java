
/**
 * Write a description of class Main here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Main
{
    public static void main(String[] args){
        CarFactory car = new EngineFactory();
        CarFactory car1 = new EngineFactory();
        
        car.makeCar("BMW5 series");
        car1.makeCar("BMW7 series");
    }
}
