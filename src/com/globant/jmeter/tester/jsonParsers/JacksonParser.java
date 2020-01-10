package com.globant.jmeter.tester.jsonParsers;

import java.io.IOException;

import org.codehaus.jackson.map.ObjectMapper;

public class JacksonParser<POJO> implements Parser<POJO> {

	@Override
	public POJO parse(String json, Class<POJO> clazz) {

		ObjectMapper objectMapper = new ObjectMapper();

		POJO obj = null;
		try {
			obj = objectMapper.readValue(json, clazz);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return obj;
	}

}
