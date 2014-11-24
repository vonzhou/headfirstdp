package factory.abstractfactory;

import factory.abstractfactory.ingredients.Cheese;
import factory.abstractfactory.ingredients.Clams;
import factory.abstractfactory.ingredients.Dough;
import factory.abstractfactory.ingredients.Pepperoni;
import factory.abstractfactory.ingredients.Sauce;
import factory.abstractfactory.ingredients.Veggies;

public interface PizzaIngredientFactory {
 
	public Dough createDough();
	public Sauce createSauce();
	public Cheese createCheese();
	public Veggies[] createVeggies();
	public Pepperoni createPepperoni();
	public Clams createClam();
 
}
