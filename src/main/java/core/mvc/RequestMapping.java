package core.mvc;

import java.util.HashMap;
import java.util.Map;

import next.controller.AttackController;
import next.controller.GalaxyController;
import next.controller.ResetController;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class RequestMapping {
	private static final Logger logger = LoggerFactory.getLogger(FrontController.class);
	private Map<String, Controller> mappings = new HashMap<String, Controller>();
	
	public void initMapping() {
		mappings.put("/galaxy.next", new GalaxyController());
		mappings.put("/reset.next", new ResetController());
		mappings.put("/attack.next", new AttackController());
		
		logger.info("Initialized Mapping Completed!");
	}

	public Controller findController(String url) {
		return mappings.get(url);
	}

	void put(String url, Controller controller) {
		mappings.put(url, controller);
	}

}
