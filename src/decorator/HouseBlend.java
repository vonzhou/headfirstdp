package decorator;

//�ǰͿ˶��ҵ��Ͽ���
public class HouseBlend extends Beverage{
	public HouseBlend(){
		description = "House Blend Coffee";
	}
	
	public double cost() {
		return 1.89;
	}
}
