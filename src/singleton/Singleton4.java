package singleton;

//����˫�ؼ���������getInstance�����м���ʹ��ͬ����ֻ�е�һ�λ�ͬ��
public class Singleton4 {
	private static volatile Singleton4 uniqueInstance;

	private Singleton4() {
	}

	// ��Сͬ����Χ
	public static synchronized Singleton4 getInstance() {
		if (uniqueInstance == null) {
			synchronized(Singleton4.class){
				if(uniqueInstance == null)//�ټ��һ�Σ���
					uniqueInstance = new Singleton4();
			}
		}
		return uniqueInstance;
	}
}
