
/**
 * Write a description of class IDCard here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class IDCard extends Product
{
    private String owner;
    IDCard(String owner) {
        System.out.println(owner + "의 카드를 만듭니다.");
        this.owner = owner;
    }
    
    public void use() {
        System.out.println(owner + "의 카드를 사용합니다.");
    }
    
    public String getOwner() {
        return owner;
    }
}
