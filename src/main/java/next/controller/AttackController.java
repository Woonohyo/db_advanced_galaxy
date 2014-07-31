package next.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import next.galaxy.GalaxyMain;
import core.mvc.Controller;

public class AttackController implements Controller {
	private GalaxyMain galaxyMain;

	@Override
	public String execute(HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		galaxyMain = new GalaxyMain();
		galaxyMain.attackGalaxy();

		return "redirect:/galaxy.next";
	}

}
