import factory.*;
/**
 * Write a description of class Main here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Main
{
    public static void main(String[] args) {
        if(args.length != 1) {
            System.out.println("");
            System.out.println("");
            System.out.println("");
            System.exit(0);
        }
        
        Factory factory = Factory.getFactory(args[0]);
       
        Link joins = factory.createLink("중앙일보", "http://www.joins.com/");
        Link chosun = factory.createLink("조선일보", "http://www.chosun.com/");
        
        Link us_yahoo = factory.createLink("Yahoo!", "http://www.yahoo.com/");
        Link kr_yahoo = factory.createLink("Yahoo!Korea", "http://www.yahoo.co.kr/");
        Link excite = factory.createLink("Excite", "http://www.excite.com/");
        Link google = factory.createLink("Google", "http://www.google.com/");
        
        Tray traynews = factory.createTray("신문");
        traynews.add(joins);
        traynews.add(chosun);
        
        Tray trayyahoo = factory.createTray("Yahoo!");
        trayyahoo.add(us_yahoo);
        trayyahoo.add(kr_yahoo);
        
        Tray traysearch = factory.createTray("검색엔진");
        traysearch.add(excite);
        traysearch.add(google);
        
        Page page = factory.createPage("LinkPake", "영진닷컴");
        page.add(traynews);
        page.add(traysearch);
        page.output();
        
    }
}
