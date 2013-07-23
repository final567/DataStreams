
public class EngineFactory extends CarFactory{
	protected Engine createCar(String car){
		if(car.equals("BMW5 series")){
			return new AEngine();
		}
		else if(car.equals("BMW7 series")){
			return new BEngine();
		}
		return null;
	}
}