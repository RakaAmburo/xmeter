package com.globant.jmeter.tester.controllers;

import org.apache.jmeter.protocol.java.sampler.JavaSamplerContext;
import org.apache.jmeter.samplers.SampleResult;
import org.apache.jmeter.threads.JMeterContextService;

import com.globant.jmeter.tester.jsonParsers.GsonParser;
import com.globant.jmeter.tester.jsonParsers.Parser;
import com.globant.jmeter.tester.pojos.add2cart.Cart;

public class AddToCartController extends ProcessResponse {

	@Override
	public SampleResult runTest(JavaSamplerContext context) {
		
		SampleResult result = new SampleResult();
		result.sampleStart(); // start stopwatch
		
		String cartRestResult = JMeterContextService.getContext().getPreviousResult().getResponseDataAsString();
		
		Parser<Cart> gsonParser = new GsonParser<Cart>();
		Cart cart = gsonParser.parse(cartRestResult, Cart.class);
		
		
		result.sampleEnd(); // stop stopwatch
		result.setSuccessful(true);
		result.setResponseMessage("Cartid: " + cart.getCartId());//+ offers.getResorts().size());
		result.setResponseCodeOK(); // 200 code
		
		
		return null;
	}

}
