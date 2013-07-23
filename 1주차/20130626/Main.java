
	import flash.display.Sprite;
 
	public class Main extends Sprite
	{
		public function Main()
		{
			var factory:SimplePizzaFactory = new SimplePizzaFactory()
			var store:PizzaStore = new PizzaStore( factory )
 
			var pizza:Pizza = store.orderPizza( "cheese" )
			trace( "주문한 피자 나왔습니다 :", pizza.getName() )
 
			pizza = store.orderPizza( "veggie" )
			trace( "주문한 피자 나왔습니다 :", pizza.getName() )
		}
	}
