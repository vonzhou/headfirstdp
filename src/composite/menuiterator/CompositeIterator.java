package composite.menuiterator;

import java.util.Iterator;
import java.util.Stack;

public class CompositeIterator implements Iterator<MenuComponent> {
	Stack<Iterator<MenuComponent>> stack = new Stack<Iterator<MenuComponent>>();

	public CompositeIterator(Iterator<MenuComponent> iterator) {
		stack.push(iterator);
	}

	public MenuComponent next() {
		if (hasNext()) {
			Iterator<MenuComponent> iterator = stack.peek();
			MenuComponent component = iterator.next();
			if (component instanceof Menu) {
				stack.push(component.createIterator());
			}
			//组合和叶节点都会获得展示，但是可以确保每个单个元素都会游走一遍
			return component;
		} else {
			return null;
		}
	}

	public boolean hasNext() {
		if (stack.empty()) {
			return false;
		} else {
			// 每次是探测去单个元素，而不是直接pop
			Iterator<MenuComponent> iterator = stack.peek();
			if (!iterator.hasNext()) {
				stack.pop(); // 当当前栈顶的元素没有孩子的时候再弹出，进入下一层
				return hasNext();//
			} else {
				return true;
			}
		}
	}

	public void remove() {
		throw new UnsupportedOperationException();
	}
}
