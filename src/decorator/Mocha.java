package decorator;

//Ħ������
public class Mocha extends CondimentDecorator{
	Beverage beverage;
	
	//��취�ñ�װ���ߣ����ϣ���¼��ʵ��������
	public Mocha(Beverage b){
		this.beverage = b;
	}
	//װ���߻�Ҫ��������װ�εĶ�����ص�
	@Override
	public String getDescription() {
		return beverage.getDescription() + ", Mocha";
	}

	@Override
	public double cost() {
		return beverage.cost() + 0.20;
	}
}
