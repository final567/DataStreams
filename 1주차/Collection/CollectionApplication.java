import java.util.*;
/**
 * Write a description of class Test here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class CollectionApplication
{
    public void run()
    {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("1: LinkedList, 2: HashSet, 3: Queue, 4: HashMap" + "\n" + "원하는 모드에 해당하는 숫자를 입력하세요.");
        String type = scan.next();
        
        Collection collection = new LinkedListTest();
        Collection collection2 = new HashSetTest();
        Collection collection3 = new QueueTest();
        HashMapTest map = new HashMapTest();
        
        String choice = "";
        do{
            choice = this.getSelection();
            System.out.println();
            String s;
            
            if(choice.equals("0")){
                System.out.println("\n\t\t" + "SYSTEM CLOSING" + "\n");
                System.out.println();
            }
            else if(choice.equals("1")){
                System.out.println("\n\t" + "추가");
                if(type.equals("4")) {
                    System.out.print("키값 : ");
                    String key = scan.next();
                    System.out.print("데이터 : ");
                    s = scan.next();
                    map.put(key, s);
                }
                else {
                    s = scan.next();
                }
                
                if(type.equals("1"))
                    collection.add(s);
                if(type.equals("2"))
                    collection2.add(s);
                if(type.equals("3"))
                    collection3.add(s);
            }
            else if(choice.equals("2"))
            {
                System.out.println("\n\t" + "삭제");
                if(type.equals("3")) {
                    collection3.remove();
                    continue;
                }
                if(type.equals("4")) {
                    System.out.print("삭제할 키값 : ");
                }
                    s = scan.next();
                
                
                if(type.equals("1"))
                    collection.remove(s);
                if(type.equals("2"))
                    collection2.remove(s);
                if(type.equals("4")) {
                    map.remove(s);
                }
            }
            else if(choice.equals("3")){
                System.out.println("\n\t" + "검색");
                s = scan.next();
                
                if(type.equals("1"))
                    collection.search(s);
                if(type.equals("2"))
                    collection2.search(s);
                if(type.equals("3"))
                    collection3.search(s);
                if(type.equals("4")) {
                    map.search(s);
                }
            }
            else if(choice.equals("4")){
                System.out.println("\n\t" + "출력");
                
                if(type.equals("1"))
                    collection.print();
                if(type.equals("2"))
                    collection2.print();
                if(type.equals("3"))
                    collection3.print();
                if(type.equals("4")) {
                    map.print();
                }
            }
            else
            {
                System.out.println("\n\t" + "UNKONWN SELECTION" + "\n");
            }
        } while (choice.equals("0") == false);
    }
    
    private String getSelection()
    {
        System.out.println();
        System.out.println("0: Quit");
        System.out.println("1: 추가");
        System.out.println("2: 삭제");
        System.out.println("3: 검색");
        System.out.println("4: 출력");

        System.out.println();

        Scanner s = new Scanner(System.in);
        return s.next();
    }
}
