import java.util.*;
/**
 * Abstract class LottoGenerator - write a description of the class here
 * 
 * @author (your name here)
 * @version (version number or date here)
 */
public abstract class LottoGenerator
{
    private ArrayList lotto = new ArrayList();
    public void addObserver(Observer o){
        lotto.add(o);
    }
    public void removeOserver(Observer o){
        lotto.remove(o);
    }
    public void notifyObserver(){
       Iterator it = lotto.iterator();
       Observer o = (Observer)it.next();
        o.upDate(this);
    }
    public abstract int getNumber();
    public abstract void random();
}
