package so.sauru.web.example.controller;

import java.util.ArrayList;
import java.util.HashMap;

import so.sauru.web.restar.Controller;
import so.sauru.web.restar.Router;

public class Animal extends Controller {

	@Override
	public HashMap<String, Object> index(HashMap<String, Object> params) {
		HashMap<String, Object> data = new HashMap<String, Object>();
		HashMap<String, Object> elem1 = new HashMap<String, Object>();
		HashMap<String, Object> elem2 = new HashMap<String, Object>();
		ArrayList<HashMap<?, ?>> list = new ArrayList<HashMap<?, ?>>();
		elem1.put("name", "Tiger");
		elem1.put("id", params.get(Router.ID));
		list.add(elem1);
		if (((String) params.get(Router.ID)).equals("*")) {
			logger.trace("OK, argument is *. add more...");
			elem2.put("name", "Lion");
			elem2.put("id", params.get(Router.ID));
			list.add(elem2);
		} else {
			logger.trace("OK, just for " + (String) params.get(Router.ID));
		}
		try {
			Thread.sleep(400);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		data.put(this.getClass().getSimpleName().toLowerCase(), list);
		return data;
	}

	@Override
	public HashMap<String, Object> create(HashMap<String, Object> message) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public HashMap<String, Object> update(HashMap<String, Object> message) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public HashMap<String, Object> delete(HashMap<String, Object> message) {
		// TODO Auto-generated method stub
		return null;
	}
}
