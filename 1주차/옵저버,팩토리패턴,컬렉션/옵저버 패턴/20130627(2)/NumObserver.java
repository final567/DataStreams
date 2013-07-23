
/**
 * Write a description of class NumObserver here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class NumObserver implements Observer
{
    public void upDate(LottoGenerator o){
        System.out.print(o.getNumber()+" ");
    }
}
