package singleton;

//使用“急切”创建实例（饿汉式），JVM会在线程访问这个静态变量之前，一定先创建这个实例，所以线程安全。
//缺点是不是在需要的时候才创建实例
public class Singleton3 {
	private static  Singleton3 uniqueInstance = new Singleton3();

	private Singleton3() {
	}

	// 直接使用
	public static  Singleton3 getInstance() {
		return uniqueInstance;
	}
}
