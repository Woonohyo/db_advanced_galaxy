package next.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import next.database.DatabaseConnection;
import core.mvc.Controller;

public class ResetController implements Controller {
	private DatabaseConnection dc;

	@Override
	public String execute(HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		dc = DatabaseConnection.getInstance();
		dc.resetGalaxies();
		
		return "redirect:/galaxy.next";
	}
}
