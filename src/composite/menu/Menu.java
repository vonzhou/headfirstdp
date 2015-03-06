package composite.menu;

import java.util.Iterator;
import java.util.ArrayList;

public class Menu extends MenuComponent {
	ArrayList<MenuComponent> menuComponents = new ArrayList<MenuComponent>();
	String name;
	String description;

	public Menu(String name, String description) {
		this.name = name;
		this.description = description;
	}

	public void add(MenuComponent menuComponent) {
		menuComponents.add(menuComponent);
	}

	public void remove(MenuComponent menuComponent) {
		menuComponents.remove(menuComponent);
	}

	public MenuComponent getChild(int i) {
		return (MenuComponent) menuComponents.get(i);
	}

	public String getName() {
		return name;
	}

	public String getDescription() {
		return description;
	}

	//注意这里，，不论是菜单还是菜单项都会递归的调用print
	public void print() {
		System.out.print("\n" + getName());
		System.out.println(", " + getDescription());
		System.out.println("---------------------");

		Iterator<MenuComponent> iterator = menuComponents.iterator();
		while (iterator.hasNext()) {
			MenuComponent menuComponent = iterator.next();
			menuComponent.print();
		}
	}
}
