/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package actions;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author
 * troll
 */
public class Help extends Action {

	@Override
	public String execute(HttpServletRequest req, HttpServletResponse resp) {
		return "help.jsp";
	}
	
}
