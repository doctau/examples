package example;
import javax.ejb.EJB;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

@WebListener
public class PropertiesListener implements ServletContextListener {
	@EJB PropertyManagerIface ejb;

	public void contextInitialized(ServletContextEvent sce) {
		load().register(sce.getServletContext().getClassLoader());
	}

	public void contextDestroyed(ServletContextEvent sce) {
		load().unregister(sce.getServletContext().getClassLoader());
	}
	
	private PropertyManagerIface load() {
		try {
			InitialContext ctx = new InitialContext();
			Object o2 = ctx.lookup("java:global/jboss-as-kitchensink-ear-ear/jboss-as-kitchensink-ear-ejb-7.1.2-SNAPSHOT/PropertiesManager");
			return (PropertyManagerIface)o2;
		} catch (NamingException e) {
			throw new RuntimeException(e);
		}
	}
}
