package composite.menuiterator;
 
import java.util.Iterator;
  
public class NullIterator implements Iterator<MenuComponent> {
   
	public MenuComponent next() {
		return null;
	}
  
	// ¹Ø¼üµã
	public boolean hasNext() {
		return false;
	}
   
	public void remove() {
		throw new UnsupportedOperationException();
	}
}
