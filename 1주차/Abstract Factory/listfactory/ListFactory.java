package listfactory;

import factory.*;
/**
 * Write a description of class ListFactory here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ListFactory extends Factory
{
    public Link createLink(String caption, String url) {
        return new ListLink(caption, url);
    }
    public Tray createTray(String caption) {
        return new ListTray(caption);
    }
    public Page createPage(String title, String author) {
        return new ListPage(title, author);
    }
}
