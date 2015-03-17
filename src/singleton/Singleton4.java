package singleton;

// ֮����ҪDouble Check��ԭ����:�����߳�P1,P2��ִ�е���pointA������ʱP1��ö�������������ͬ���飬
//Ȼ���ִ�ʱuniqueInstance��ȷΪ�գ����Թ���һ��ʵ�����˳�ͬ���飬�ͷ���������P2���������ͬ������
// ����ʱ������ٴ��ж�uniqueInstance�ǿյĻ������ٴι���һ��ʵ�����Ӷ����ٵ�����

//����˫�ؼ���������getInstance�����м���ʹ��ͬ����ֻ�е�һ�λ�ͬ��
public class Singleton4 {
	private static volatile Singleton4 uniqueInstance;

	private Singleton4() {
	}

	// ��Сͬ����Χ
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
