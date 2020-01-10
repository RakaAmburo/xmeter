package com.globant.jmeter.tester;

import java.io.IOException;
import java.net.URISyntaxException;
import java.nio.file.Files;
import java.nio.file.Paths;

import org.json.JSONException;
import org.json.JSONObject;
import org.junit.Test;

import com.globant.jmeter.tester.jsonParsers.GsonParser;
import com.globant.jmeter.tester.jsonParsers.JacksonParser;
import com.globant.jmeter.tester.jsonParsers.Parser;
import com.globant.jmeter.tester.pojos.offer.Offer;

public class TestJsonParsers {

	@Test
	public void gsonParserTest() throws IOException, URISyntaxException {

		// Gson parser test
		Parser<Offer> gsonParser = new GsonParser<Offer>();
		String jsonOffers = new String(
				Files.readAllBytes(Paths
						.get(TestJsonParsers.class
								.getClass()
								.getResource(
										"/com/globant/jmeter/tester/jsonsSamples/offers")
								.toURI())));
		Offer offerGson = gsonParser.parse(jsonOffers, Offer.class);
		System.out.println(offerGson.getType().toString());
		System.out.println(offerGson.getResorts());
		System.out.println(offerGson.getPackages().size());
		System.out.println(offerGson.getResorts().toString());
		System.out.println(offerGson.getResorts().size());
		System.out.println("PONER ASSERTS AQUI SHORSH");

	}

	@Test
	public void jacksonParserTest() throws IOException, URISyntaxException {
		// Jackson parser test
		String shallow = new String(
				Files.readAllBytes(Paths
						.get(TestJsonParsers.class
								.getClass()
								.getResource(
										"/com/globant/jmeter/tester/jsonsSamples/offers")
								.toURI())));
		Parser<Offer> jackonParser = new JacksonParser<Offer>();
		Offer offer = jackonParser.parse(shallow, Offer.class);
		System.out.println(offer.getResorts().get(0).getId());
	}

	@Test
	public void shallowSpecialParserTest() throws IOException, URISyntaxException,
			JSONException {

		// Jackson parser test
		String shallow = new String(
				Files.readAllBytes(Paths
						.get(TestJsonParsers.class
								.getClass()
								.getResource(
										"/com/globant/jmeter/tester/jsonsSamples/shallow")
								.toURI())));

		JSONObject jobj = new JSONObject(shallow);
		JSONObject resorts = jobj.getJSONObject("resorts");
		String[] resortsNames = JSONObject.getNames(resorts);
		for (int i = 0; i < resortsNames.length; i++) {
			System.out.println(resortsNames[i]);
		}

		System.out.println("PONER ASSERTS AQUI SHORSH");

	}

}
