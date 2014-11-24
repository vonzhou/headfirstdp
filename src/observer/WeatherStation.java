package observer;

//测试程序
public class WeatherStation {
	public static void main(String[] args) {
		WeatherData data = new WeatherData();
		CurrentConditionDisplay ccd = new CurrentConditionDisplay(data);
		StatisticsDisplay sd = new StatisticsDisplay(data);
		ForecastDisplay fd = new ForecastDisplay(data);
		
		
		
		//改变主题状态
		data.setMeasurement(80, 50, 100);
	}
}
