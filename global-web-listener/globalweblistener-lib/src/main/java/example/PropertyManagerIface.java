package example;

import javax.ejb.Local;
import javax.ejb.Remote;

@Local
public interface PropertyManagerIface {
	void register(ClassLoader cl);
	void unregister(ClassLoader cl);
}