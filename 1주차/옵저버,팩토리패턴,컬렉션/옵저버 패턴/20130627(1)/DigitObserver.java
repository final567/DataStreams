
/**
 * Write a description of class DigitObserver here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class DigitObserver implements Observer
{
    public void update(NumberGenerator generator){
        System.out.println("DigitObserver:" + generator.getNumber());
    }
}
