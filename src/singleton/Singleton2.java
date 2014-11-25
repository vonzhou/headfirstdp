package singleton;

//�Է���������ͬ���̶߳���ĵ���
//����ֻ�е�һ��ִ��getInstanceʱ����������Ҫͬ��������ʱ���Ƕ����ܵ����
public class Singleton2 {
	private static Singleton2 uniqueInstance;

	private Singleton2() {
	}

	// ÿ�ζ���Ҫͬ��
	public static synchronized Singleton2 getInstance() {
		if (uniqueInstance == null) {
			uniqueInstance = new Singleton2();
		}
		return uniqueInstance;
	}
}
