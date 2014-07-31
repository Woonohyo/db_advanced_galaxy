package next.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import next.database.DatabaseConnection;
import next.dto.Galaxy;
import next.galaxy.GalaxyMain;
import core.mvc.Controller;

public class GalaxyController implements Controller {
	private List<Galaxy> galaxies;
	private DatabaseConnection dc;
	private GalaxyMain galaxyMain;
	
	@Override
	public String execute(HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		
		dc = DatabaseConnection.getInstance();
		galaxies = dc.getGalaxies();
		request.setAttribute("galaxies", galaxies);
		return "galaxy.jsp";
	}
}