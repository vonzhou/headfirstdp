package templatemethod.app;

import java.util.Arrays;

public class DuckSortTest {
	public static void main(String[] args) {
		Duck ds[] = {
				new Duck("abc", 3),
				new Duck("vvv", 2),
				new Duck("asdfbc", 2),
				new Duck("gfg", 5),
				new Duck("ewrwe", 1),
				new Duck("bb", 9),
		};
		System.out.println("Before sorting...");
		display(ds);
		
		Arrays.sort(ds);
		
		System.out.println("after sorting...");
		display(ds);
	}

	private static void display(Duck[] ds) {
		for(int i=0; i<ds.length; i++)
			System.out.println(ds[i]);
	}
}
