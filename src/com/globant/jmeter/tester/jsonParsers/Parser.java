package com.globant.jmeter.tester.jsonParsers;

/**
 * @author pablo
 * 
 * Generic interface to decide witch implementation to use depending on the size of
 * the json. Declaring typo POJO with identify the entity we are using.
 *
 * @param <POJO>
 */
public interface Parser<POJO> {
	public POJO parse(String json, Class<POJO> clazz);
}
