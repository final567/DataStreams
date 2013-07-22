public class PizzaStore
	{
		private var factory:SimplePizzaFactory;
 
		public function PizzaStore( $factory:SimplePizzaFactory )
		{
			this.factory = $factory;
		}
 
		public function orderPizza( $type:String ):Pizza
		{
			var pizza:Pizza;
 
			pizza = factory.createPizza( $type );
 
			pizza.prepare();
			pizza.bake();
			pizza.cut();
			pizza.box();
 
			return pizza;
		}
	}
