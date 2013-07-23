public abstract class PizzaStore {
 //추상 메소드. 서브클래스에서 구체화한다.
    protected abstract Pizza createPizza(String type);

    public Pizza orderPizza(String ts) {

        Pizza pizza = createPizza(ts);

        pizza.prepare();

        pizza.bake();

        pizza.cut();

        pizza.box();

        return pizza;

    }

}


