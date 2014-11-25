package singleton;

//����ʵ�ַ�ʽ�������ڶ��̻߳����¾ͻ�����⣬
//���������߳�ͬʱ������uniqueInstance==null��������·��
public class Singleton {
	private static Singleton uniqueInstance;

	private Singleton() {
	} //

	public static Singleton getInstance() {
		if (uniqueInstance == null) { // �ӳ�ʵ����������ʽ
			uniqueInstance = new Singleton();
		}
		return uniqueInstance;
	}
}
