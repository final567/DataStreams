package factory;
/**
 * Write a description of class Link here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public abstract class Link extends Item
{
    protected String url;
    public Link(String caption, String url) {
        super(caption);
        this.url = url;
    }
}
