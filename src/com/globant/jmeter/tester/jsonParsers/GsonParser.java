package com.globant.jmeter.tester.jsonParsers;

import com.google.gson.Gson;

public class GsonParser<POJO> implements Parser<POJO> {

	@Override
	public POJO parse(String json, Class<POJO> clazz) {

		Gson gson = new Gson();
		POJO obj = gson.fromJson(json, clazz);
		return obj;

	}

}
