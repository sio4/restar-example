package so.sauru.web.example.controller;

import java.io.IOException;
import java.util.HashMap;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import so.sauru.web.utils.Controller;

@WebServlet(name = "animal", urlPatterns = {})
public class Animal extends Controller {
	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		resp.getWriter().println(index(req, resp).toString());
	}

	@Override
	public Object index(HttpServletRequest req, HttpServletResponse resp) {
		return index("1");
	}

	@Override
	public Object index(String id) {
		HashMap<String, Object> data = new HashMap<String, Object>();
		data.put("name", "Tiger");
		data.put("id", id);
		return data;
	}
}
