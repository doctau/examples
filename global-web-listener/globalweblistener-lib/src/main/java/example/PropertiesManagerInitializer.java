package example;

import java.util.Set;

import javax.servlet.ServletContainerInitializer;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;

public class PropertiesManagerInitializer implements ServletContainerInitializer {
	public void onStartup(Set<Class<?>> c, ServletContext ctx)
			throws ServletException {
		ctx.addListener(PropertiesListener.class);
	}
}
