package singleton;

//利用双重检查加锁，在getInstance方法中减少使用同步，只有第一次会同步
public class Singleton4 {
	private static volatile Singleton4 uniqueInstance;

	private Singleton4() {
	}

	// 缩小同步范围
	public static synchronized Singleton4 getInstance() {
		if (uniqueInstance == null) {
			synchronized(Singleton4.class){
				if(uniqueInstance == null)//再检查一次？？
					uniqueInstance = new Singleton4();
			}
		}
		return uniqueInstance;
	}
}
