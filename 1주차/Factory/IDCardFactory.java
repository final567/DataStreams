import java.util.*;
/**
 * Write a description of class IDCardFactory here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class IDCardFactory extends Factory
{
    private List owners = new ArrayList();
    protected Product createProduct(String owner) {
        return new IDCard(owner);
    }
    
    protected void registerProduct(Product product) {
        owners.add(((IDCard)product).getOwner());
    }
    
    public List getOwners() {
        return owners;
    }
}
