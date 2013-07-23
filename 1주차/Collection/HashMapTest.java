import java.util.*;
/**
 * Write a description of class ArrayList here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class HashMapTest
{    
    public HashMap <String,String> map = new HashMap <String,String>();
    Set<String> ketSet = map.keySet();
    
    public void put(String key, String s) {
        if((map.get(key)) != null){
            System.out.println("이미 입력되어 있는 key 값입니다. 기존에 입력되어 있는 데이터 " + map.get(key) + "를 삭제하고 새로운 데이터 " + s + "를 입력합니다.");
        }
        
        map.put(key, s);
    }
    
    public void remove(String key) {
        map.remove(key);
    }
    
    public void search(String s) {
      int i = 0;
      for(String temp : ketSet) {
        if((map.get(temp)).equals(s)){
            System.out.println(temp + " key에서 " + s + "를 찾았습니다.");
        }
        i++;
      }
      
    }
    
    public void print() {
        for(String temp : ketSet) {
            System.out.println(temp + " = " + map.get(temp));
        }
    }
}
