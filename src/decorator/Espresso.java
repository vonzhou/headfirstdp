package decorator;

//Ũ������
public class Espresso extends Beverage{
	//Ϊ�������������ϵ������������ڹ��췽�������ü̳��Ի���ı���
	public Espresso(){
		description = "Espresso";
	}
	
	public double cost() {
		return 1.99;
	}
}
