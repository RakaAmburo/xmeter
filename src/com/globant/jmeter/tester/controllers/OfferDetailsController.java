package com.globant.jmeter.tester.controllers;

import java.util.Iterator;
import java.util.List;

import org.apache.jmeter.protocol.java.sampler.JavaSamplerContext;
import org.apache.jmeter.samplers.SampleResult;
import org.apache.jmeter.threads.JMeterContextService;
import org.apache.jmeter.threads.JMeterVariables;

import com.globant.jmeter.tester.jsonParsers.GsonParser;
import com.globant.jmeter.tester.jsonParsers.Parser;
import com.globant.jmeter.tester.pojos.offer.Offer;
import com.globant.jmeter.tester.pojos.offer.Resort;

public class OfferDetailsController extends ProcessResponse {

	@SuppressWarnings("deprecation")
	@Override
	public SampleResult runTest(JavaSamplerContext context) {
		SampleResult result = new SampleResult();
		result.sampleStart(); // start stopwatch

		String rest = JMeterContextService.getContext().getPreviousResult().getResponseDataAsString();
		
		JMeterVariables vars = JMeterContextService.getContext().getVariables();
        String controller = (String)vars.getObject( "controller" );

		Parser<Offer> gsonParser = new GsonParser<Offer>();
		Offer offers = gsonParser.parse(rest, Offer.class);

		if (offers.getResorts().isEmpty()) {
			result.sampleEnd(); // stop stopwatch
			result.setSuccessful(false);
			result.setResponseMessage("No resorts on shallow search worning");
			// result.setResponseCodeOK(); // 200 code
			result.setResponseCode("Fail");
		} else {
			
			context.getParameter("test");

			result.sampleEnd(); // stop stopwatch
			result.setSuccessful(true);
			result.setResponseMessage("Number of resorts var " + controller);//+ offers.getResorts().size());
			result.setResponseCodeOK(); // 200 code

			StringBuffer resortList = new StringBuffer("Resort list:\n");
			List<Resort> resorts = offers.getResorts();
			for (Iterator<Resort> iterator = resorts.iterator(); iterator.hasNext();) {
				Resort resort = (Resort) iterator.next();
				resortList.append(resort.getId() + "\n");

			}

			result.setResponseData(resortList.toString());

		}

		return result;
	}

}
