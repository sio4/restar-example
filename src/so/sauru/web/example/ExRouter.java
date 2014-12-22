package so.sauru.web.example;

import javax.servlet.annotation.WebServlet;

import so.sauru.web.restar.Router;

/**
 * Servlet implementation class ExRouter
 */
@WebServlet(description = "Path Router", urlPatterns = { "/ExRouter/*" })
public class ExRouter extends Router {
	private static final long serialVersionUID = 1L;
}
