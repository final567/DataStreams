package factory;
import java.util.ArrayList;
/**
 * Write a description of class Tray here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public abstract class Tray extends Item
{
    protected ArrayList tray = new ArrayList();
    public Tray(String caption) {
        super(caption);
    }
    public void add(Item item) {
        tray.add(item);
    }
}
