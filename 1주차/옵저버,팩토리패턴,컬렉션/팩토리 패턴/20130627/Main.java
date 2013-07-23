
/**
 * Write a description of class Main here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Main
{
    public static void main(String[] args){
        PizzaStore pizzaType1 = new NYPizzaFactory();
        PizzaStore pizzaType2 = new LAPizzaFactory();
        
        pizzaType1.orderPizza("cheese");
        pizzaType2.orderPizza("basic");
        

    }
}
