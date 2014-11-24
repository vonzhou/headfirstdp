package observer;

import java.util.ArrayList;

public class WeatherData implements Subject{
	private ArrayList<Observer>  observers;
	private float temperature;
	private float humidity;
	private float pressure;
	
	public WeatherData(){
		this.observers = new ArrayList<Observer>();
	}

	@Override
	public void registerObserver(Observer o) {
		this.observers.add(o);
	}

	@Override
	public void removeObserver(Observer o) {
		// O(n)复杂度
		int i = observers.indexOf(o);
		if(i >= 0){
			observers.remove(i);
		}
	}

	@Override
	public void notifyObservers() {
		for(int i=0; i<observers.size(); i++){
			Observer o = observers.get(i);
			o.update(this.temperature, this.humidity, this.pressure);
		}
	}
	
	//当测量数据发送改变时，就通知这些观察者；
	public void measurementChanged(){
		notifyObservers();
	}
	
	//模拟实时监测数据的改变
	// be called some way
	public void setMeasurement(float temperature, float humidity, float pressure){
		this.temperature = temperature;
		this.humidity = humidity;
		this.pressure = pressure;
		measurementChanged();
	}
}
