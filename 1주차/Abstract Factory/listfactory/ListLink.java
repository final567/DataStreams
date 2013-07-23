package listfactory;

import factory.*;
/**
 * Write a description of class ListFactory here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ListLink extends Link
{
    public ListLink(String caption, String url) {
        super(caption, url);
    }
    public String makeHTML() {
        return " <li><a href=\"" + url + "\">" + caption + "</a></li>\n";
    }
}
