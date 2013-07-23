
/**
 * Write a description of class GraphObserver here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class GraphObserver implements Observer
{
   public void update(NumberGenerator generator){
       System.out.println("GraphObserver:");
       int count = generator.getNumber();
       for(int i = 0; i < count ; i++){
           System.out.print("*");
        }
       System.out.println("");
    }
}
