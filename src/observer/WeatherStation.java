package observer;

//���Գ���
public class WeatherStation {
	public static void main(String[] args) {
		WeatherData data = new WeatherData();
		CurrentConditionDisplay ccd = new CurrentConditionDisplay(data);
		StatisticsDisplay sd = new StatisticsDisplay(data);
		ForecastDisplay fd = new ForecastDisplay(data);
		
		
		
		//�ı�����״̬
		data.setMeasurement(80, 50, 100);
	}
}
