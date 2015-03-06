package singleton;

import java.awt.Desktop;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;

public class FindSingleton {
	
	public static void main(String[] args) throws IOException, URISyntaxException {
		
		Runtime rt = Runtime.getRuntime();
		System.out.println(rt.maxMemory());
		
		Desktop desk = Desktop.getDesktop();
		System.out.println(Desktop.isDesktopSupported());
		desk.browse(new URI("www.baidu.com"));  // 打开浏览器访问该URI
	}

}
