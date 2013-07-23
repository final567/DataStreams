import java.util.Random;
/**
 * Write a description of class RandomNumberGenerator here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class RandomNumberGenerator extends NumberGenerator
{
    private Random random = new Random();
    private int number;
    
    public int getNumber() {
        return number;
    }
    
    public void execute() {
        for(int i = 0; i<10; i++) {
            number = random.nextInt(50);
            notifyObservers();
        }
    }
}
