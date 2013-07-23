import java.util.*;
/**
 * Write a description of class ArrayList here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class QueueTest implements Collection
{    
    public LinkedList <String> list = new LinkedList <String>();
    
    public void add(String s) {
        list.addFirst(s);
    }
    
    public void remove(String s){};
    
    public void remove() {
        list.removeFirst();
    }
    
    public void search(String s) {
      Iterator iter = list.iterator();
      int i = 0;
      while (iter.hasNext() == true){
        if((list.get(i)).equals(s)){
            System.out.println(i+1 + "번째에서 " + s + "를 찾았습니다.");
        }
        iter.next();
        i++;
      }
    }
    
    public void print() {
        for(String temp : list) {
            System.out.println(temp);
        }
    }
}
