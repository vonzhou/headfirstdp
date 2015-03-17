package singleton;

import java.awt.Desktop;

public class LookJDK {
	public static void main(String[] args) {
		Runtime r = Runtime.getRuntime();
		System.out.println(r.maxMemory());
		
		Desktop d = Desktop.getDesktop();
	}

}
