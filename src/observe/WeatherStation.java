package observe;

public class WeatherStation {
	public static void main(String[] args) {
		WeatherData weatherData = new WeatherData();
        
        ConcurrentConditionDisplay conditionsDisplay = new ConcurrentConditionDisplay(weatherData);
    
        weatherData.setMeasurements(80, 65, 30.4f);
        weatherData.setMeasurements(82, 70, 29.2f);
        weatherData.setMeasurements(78, 78, 40.4f);
	}
}
