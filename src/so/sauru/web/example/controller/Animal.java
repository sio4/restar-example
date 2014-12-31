package so.sauru.web.example.controller;

import java.util.ArrayList;
import java.util.HashMap;

import so.sauru.web.restar.Controller;

public class Animal extends Controller {

	@Override
	public HashMap<String, Object> index(HashMap<String, Object> params) {
		HashMap<String, Object> data = new HashMap<String, Object>();
		HashMap<String, Object> elem1 = new HashMap<String, Object>();
		HashMap<String, Object> elem2 = new HashMap<String, Object>();
		ArrayList<HashMap<?, ?>> list = new ArrayList<HashMap<?, ?>>();
		elem1.put("name", "Tiger");
		elem1.put("id", params.get("argument"));
		list.add(elem1);
		if (((String) params.get("argument")).equals("*")) {
			logger.trace("OK, argument is *. add more...");
			elem2.put("name", "Lion");
			elem2.put("id", params.get("argument"));
			list.add(elem2);
		} else {
			logger.trace("OK, just for " + (String) params.get("argument"));
		}
		data.put(this.getClass().getSimpleName().toLowerCase(), list);
		return data;
	}
}
