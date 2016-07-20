package com.dispatcher;

import org.apache.log4j.PropertyConfigurator;
import javax.servlet.http.HttpServlet;

public class Log4jInit extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public void init() {
		String prefix = getServletContext().getRealPath("/");
		// web.xml 에서 초기화 값을 가져옴
		String file = getInitParameter("log4j-init-file");

		// if the log4j-init-file context parameter is not set, then no point in
		// trying
		if (file != null) {
			PropertyConfigurator.configure(prefix + file);
			System.out.println("Log4J Logging started: " + prefix + file);
		} else {
			System.out.println("Log4J Is not configured for your Application: " + prefix + file);
		}
	}
}