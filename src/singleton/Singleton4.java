package singleton;

// 之所以要Double Check的原因是:假设线程P1,P2都执行到了pointA处，此时P1获得对象锁，进入了同步块，
//然后发现此时uniqueInstance的确为空，所以构造一个实例，退出同步块，释放锁，而后P2获得锁进入同步区域，
// 在这时如果不再次判断uniqueInstance非空的话，会再次构建一个实例，从而不再单例。

//利用双重检查加锁，在getInstance方法中减少使用同步，只有第一次会同步
public class Singleton4 {
	private static volatile Singleton4 uniqueInstance;

	private Singleton4() {
	}

	// 缩小同步范围
	public static synchronized Singleton4 getInstance() {
		if (uniqueInstance == null) {//pointA
			synchronized(Singleton4.class){
				if(uniqueInstance == null)//pointB
					uniqueInstance = new Singleton4();
			}
		}
		return uniqueInstance;
	}
}
