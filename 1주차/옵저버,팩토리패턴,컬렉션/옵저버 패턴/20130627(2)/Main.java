
/**
 * Write a description of class Main here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Main
{
   public static void main(String[] args){
       LottoGenerator lotto = new RandomLotto();
       Observer observer = new NumObserver();
       lotto.addObserver(observer);
       System.out.print("로또 번호  : ");
       lotto.random();
    }
}