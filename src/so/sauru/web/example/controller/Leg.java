package so.sauru.web.example.controller;

import java.util.ArrayList;
import java.util.HashMap;

import so.sauru.web.restar.Controller;

public class Leg extends Controller {

	@Override
	public HashMap<String, Object> index(HashMap<String, Object> params) {
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
		if (((String) params.get("argument")).equals("*")) {
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
		} else {
			logger.trace("ok, just for " + (String) params.get("argument"));
		}
		data.put(this.getClass().getSimpleName().toLowerCase(), list);
		return data;
	}
}
