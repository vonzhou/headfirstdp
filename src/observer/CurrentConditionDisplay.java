package observer;

//��ǰ����״�������
public class CurrentConditionDisplay implements Observer, DisplayElement{
	private float temperature;
	private float humidity;
	private Subject weatherData;
	//��WeatherData��Ϊ��������������Ϊע��֮��
	public CurrentConditionDisplay(Subject weatherData){
		this.weatherData = weatherData;
		weatherData.registerObserver(this);
	}

	@Override
	public void display() {
		System.out.println("CurrentConditionDisplay: " + this.temperature + " F degrees and "
						+ this.humidity + "% humidity..");
	}

	@Override
	public void update(float temp, float humidity, float pressure) {
		//�Ȱ�״̬�ı䱣���������������ҵ������ʾ��
		this.temperature = temp;
		this.humidity = humidity;
		display();
	}
}
