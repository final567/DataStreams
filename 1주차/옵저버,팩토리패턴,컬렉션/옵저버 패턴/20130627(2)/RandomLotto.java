import java.util.*;
/**
 * Write a description of class RandomLotto here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class RandomLotto extends LottoGenerator
{
   private int number;
   private int[] find = new int[7];
   private Random random = new Random();
   public int getNumber(){
       return number+1;
    }
    public void random(){
        for(int i = 0; i<7;i++){
            int flag = 0;
            number = random.nextInt(50);
            find[i] = number;
            for(int j = 0; j<i; j++){
                if(find[i]==find[j])
                {
                    i--;
                    flag++;
                }
            }
            if(flag != 0)
            {
                continue;
            }
            notifyObserver();
       }
    }
}
