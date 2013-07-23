
/**
 * Write a description of class CarFactory here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public abstract class CarFactory
{
   protected abstract Engine createCar(String car);
   
   protected void makeCar(String type){
       Engine engine = createCar(type);
       
       engine.make();
    }
}
