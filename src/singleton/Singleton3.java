package singleton;

//ʹ�á����С�����ʵ��������ʽ����JVM�����̷߳��������̬����֮ǰ��һ���ȴ������ʵ���������̰߳�ȫ��
//ȱ���ǲ�������Ҫ��ʱ��Ŵ���ʵ��
public class Singleton3 {
	private static  Singleton3 uniqueInstance = new Singleton3();

	private Singleton3() {
	}

	// ֱ��ʹ��
	public static  Singleton3 getInstance() {
		return uniqueInstance;
	}
}
