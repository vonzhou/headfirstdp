package factory.abstractfactory;

public abstract class PizzaStore {
 
	// ��Ȼ�͹���������һ�����ɾ���ĵ������������ɺ��ֿ�ζ������
	protected abstract Pizza createPizza(String item);
 
	public Pizza orderPizza(String type) {
		Pizza pizza = createPizza(type);
		System.out.println("--- Making a " + pizza.getName() + " ---");
		pizza.prepare();
		pizza.bake();
		pizza.cut();
		pizza.box();
		return pizza;
	}
}
