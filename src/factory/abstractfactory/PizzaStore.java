package factory.abstractfactory;

public abstract class PizzaStore {
 
	// 仍然和工厂方法中一样，由具体的店铺来决定生成何种口味的披萨
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
