package so.sauru.web.example;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import so.sauru.web.restar.Trace;

/**
 * Servlet implementation class Home
 */
@WebServlet(name = "Home", urlPatterns = { "/" })
public class Home extends HttpServlet {
	private static final long serialVersionUID = 1L;
	Trace tracer = new Trace("Home");

	/**
	 * @see HttpServlet#doGet(HttpServletRequest, HttpServletResponse)
	 */
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		PrintWriter out = resp.getWriter();

		out.println("Trace --");
		out.println(tracer.tag("test-0"));
		tracer.sleep(1 * 1000);
		out.println(tracer.tag("test-1"));
		tracer.sleep(1 * 1000);
		out.println(tracer.tag("test-2"));
		tracer.sleep(1 * 1000);
		out.println(tracer.reset());
		tracer.sleep(1 * 1000);
		out.println(tracer.tag("test-1"));
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest, HttpServletResponse)
	 */
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
	}

}
