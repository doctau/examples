package example;

import java.io.IOException;
import java.io.InputStream;
import java.net.URL;

import javax.ejb.Singleton;

@Singleton
public class PropertiesManager implements PropertyManagerIface {
	public void register(ClassLoader cl) {
		System.out.println("registered " + cl);
		InputStream is = null;
		try {
			URL url = cl.getResource("example.properties");
			is = url.openStream();
			byte[] buffer = new byte[1024];
			int len;
			while ((len = is.read(buffer)) != -1) {
			    System.out.write(buffer, 0, len);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			try {
				if (is != null) {
					is.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

	public void unregister(ClassLoader cl) {
		System.out.println("unregistered " + cl);
		
	}
}
