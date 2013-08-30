package example.servlet;

import java.util.logging.Logger;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;

@WebServlet("/a")
public class Servlet1 extends HttpServlet {
	static {
		Logger logger = Logger.getLogger(Servlet1.class.getName());
		logger.info("x");
	}
}
