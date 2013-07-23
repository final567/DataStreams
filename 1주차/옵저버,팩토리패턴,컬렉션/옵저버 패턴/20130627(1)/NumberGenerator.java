import java.util.*;//참조하지 않는 새로운 객체 생성 가능
/**
 * Abstract class NumberGenerator - write a description of the class here
 * 
 * @author (your name here)
 * @version (version number or date here)
 */
public abstract class NumberGenerator
{
    private ArrayList observers = new ArrayList();//ArratList는 자료를 순차적으로 만듣다
    public void addObserver(Observer observer){
        observers.add(observer);
    }
    public void deleteObserver(Observer observer){
        observers.remove(observer);
    }
    public void notifyObservers(){
        Iterator it = observers.iterator();//순차적으로 만든 자료들을 알 수 있다,it이 하나씩 참조한다.
        while (it.hasNext()){//it.hasnext()는 추가자료가 있는지 검사
            Observer o = (Observer)it.next();//it.next는 추가 자료로 넘어가는 것
            o.update(this);
        }
    }
    public abstract int getNumber();
    public abstract void execute();
}
