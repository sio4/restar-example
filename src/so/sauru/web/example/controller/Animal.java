package so.sauru.web.example.controller;

import java.util.HashMap;

import so.sauru.web.restar.Controller;

public class Animal extends Controller {

	@Override
	public Object index(HashMap<String, Object> params) {
		HashMap<String, Object> data = new HashMap<String, Object>();
		data.put("name", "Tiger");
		data.put("id", params.get("id"));
		return data;
	}
}
