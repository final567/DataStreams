package listfactory;

import factory.*;
import java.util.Iterator;
/**
 * Write a description of class ListTray here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ListTray extends Tray
{
    public ListTray(String caption) {
        super(caption);
    }
    
    public String makeHTML() {
        StringBuffer buffer = new StringBuffer();
        buffer.append("<li>\n");
        buffer.append(caption + "\n");
        buffer.append("<ul>\n");
        Iterator it = tray.iterator();
        while(it.hasNext()) {
            Item item = (Item)it.next();
            buffer.append(item.makeHTML());
        }
        buffer.append("</ul>\n");
        buffer.append("</li>\n");
        
        return buffer.toString();
    }
}
