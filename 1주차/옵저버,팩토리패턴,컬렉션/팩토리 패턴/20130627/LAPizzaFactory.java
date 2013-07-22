public class LAPizzaFactory extends PizzaStore {

 @Override
    protected Pizza createPizza(String type){

        if(type.equals("cheese")){

            return new LAStyleCheesePizza();

        } else if (type.equals("basic")){

            return new LAStyleBasicPizza();

        } else {
   return null;
  }

    }

}

