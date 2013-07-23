import java.util.*;
/**
 * Write a description of class ArrayList here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class HashSetTest implements Collection
{    
    public HashSet <String> list = new HashSet <String>();
    
    public void add(String s) {
        if(list.contains(s)) {
            System.out.println(s + "는 중복된 데이터입니다.");
        }
        else
            list.add(s);
    }
    
    public void remove(String s) {
        list.remove(s);
    }
    
    public void remove(){};
    
    public void search(String s) {
      int i = 0;
      for(String temp : list) {
          if(temp.equals(s)) {
              System.out.println(i+1 + "째에서 " + s + "를 찾았습니다.");
              break;
          }
          else if(i == list.size()) {
              System.out.println(s + "를 찾지 못했습니다.");
          }
          i++;
      }
    }
    
    public void print() {
        for(String temp : list) {
            System.out.println(temp);
        }
    }
}
