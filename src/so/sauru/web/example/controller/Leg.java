package so.sauru.web.example.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import so.sauru.web.utils.Controller;

@WebServlet(name = "leg", urlPatterns = {})
public class Leg extends Controller {
	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		resp.getWriter().println(index(req, resp).toString());
	}

	public Object index(HttpServletRequest req, HttpServletResponse resp) {
		return index("*");
	}

	@Override
	public Object index(String id) {
		HashMap<String, Object> data = new HashMap<String, Object>();
		HashMap<String, Object> elem1 = new HashMap<String, Object>();
		HashMap<String, Object> elem2 = new HashMap<String, Object>();
		HashMap<String, Object> elem3 = new HashMap<String, Object>();
		HashMap<String, Object> elem4 = new HashMap<String, Object>();
		ArrayList<HashMap<?, ?>> list = new ArrayList<HashMap<?, ?>>();
		elem1.put("name", "front-left");
		elem1.put("length", "600");
		elem1.put("finger", "4");
		list.add(elem1);
		elem2.put("name", "front-right");
		elem2.put("length", "600");
		elem2.put("finger", "4");
		list.add(elem2);
		elem3.put("name", "rear-left");
		elem3.put("length", "700");
		elem3.put("finger", "4");
		list.add(elem3);
		elem4.put("name", "rear-right");
		elem4.put("length", "700");
		elem4.put("finger", "4");
		list.add(elem4);

		data.put("legs", list);
		return data;
	}
}
