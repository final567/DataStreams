public class Pizza
	{
		protected String name;
		protected String dough;
		protected String sauce;
		protected String toppings[];
 
		public String getName()
		{
			return name;
		}
 
		public void prepare()
		{
			String display = "n-----";
			display += name + "를 준비합니다 -----";
			display += "n도우 반죽중...";
			display += "n소스 추가중...";
			String t = "";
			for (int i = 0; i < toppings.length; i++ )
			{
				t += toppings[ i ].toString() + ", ";
			}
			display += ("n토핑 추가중... : " + t);
 
			trace( "n", display );
		}
 
		public void bake()
		{
			trace( "피자를 굽습니다 :", name );
		}
 
		public void cut()
		{
			trace( "피자를 자릅니다 :", name );
		}
 
		public void box()
		{
			trace( "피자를 포장합니다 :", name );
		}
	}
