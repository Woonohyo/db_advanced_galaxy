package next.support.init;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.jdbc.datasource.init.ResourceDatabasePopulator;

public class JwpContextLoaderListender implements ServletContextListener {
	private static final Logger logger = LoggerFactory.getLogger(JwpContextLoaderListender.class);
	
	@Override
	public void contextInitialized(ServletContextEvent sce) {
		ResourceDatabasePopulator populator = new ResourceDatabasePopulator();
		populator.addScript(new ClassPathResource("jwp.sql"));
	}

	@Override
	public void contextDestroyed(ServletContextEvent sce) {
	}
}
