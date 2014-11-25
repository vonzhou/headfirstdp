package singleton;

//对方法加锁，同步线程对其的调用
//但是只有第一次执行getInstance时，才真正需要同步，其他时候都是对性能的损耗
public class Singleton2 {
	private static Singleton2 uniqueInstance;

	private Singleton2() {
	}

	// 每次都需要同步
	public static synchronized Singleton2 getInstance() {
		if (uniqueInstance == null) {
			uniqueInstance = new Singleton2();
		}
		return uniqueInstance;
	}
}
