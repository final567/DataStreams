
/**
 * Write a description of class Main here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Main
{
    public static void main(String[] args) {
       Factory factory = new IDCardFactory();
       Product card1 = factory.create("홍길동");
       Product card2 = factory.create("이순신");
       Product card3 = factory.create("강감찬");
       card1.use();
       card2.use();
       card3.use();
    }
}
