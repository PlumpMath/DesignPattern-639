package observe;

public class ConcurrentConditionDisplay implements Observe, DisplayElement{
	private float temperature;
	private float humidity;
	private WeatherData weatherData;
	public ConcurrentConditionDisplay(WeatherData weatherData){
		this.weatherData =weatherData;
		weatherData.registerObserver(this);
	}
	@Override
	public void display() {
		// TODO Auto-generated method stub
		 System.out.println("Current conditions:"+temperature+"F degrees and "+humidity+"% humidity");

	}

	@Override
	public void update(float temp, float humidity, float pressure) {
		// TODO Auto-generated method stub
		this.temperature = temp;
		this.humidity = humidity;
		display();
	}

}
