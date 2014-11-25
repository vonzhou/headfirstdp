package templatemethod.app;

public class Duck implements Comparable{

	String name;
	int weight;
	public Duck(String name, int weight){
		this.name= name;
		this.weight = weight;
	}
	@Override
	public String toString() {
		return name+" weighs " + weight;
	}
	@Override
	public int compareTo(Object o) {
		Duck other = (Duck)o;
		if(this.weight < other.weight)
			return -1;
		else if(this.weight == other.weight)
			return 0;
		else return 1;
	}

}
