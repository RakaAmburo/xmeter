package com.globant.jmeter.tester.controllers;

import org.apache.jmeter.protocol.java.sampler.JavaSamplerContext;
import org.apache.jmeter.samplers.SampleResult;
import org.json.JSONObject;
import com.globant.jmeter.tester.pojos.offer.Affiliation;
import com.globant.jmeter.tester.pojos.offer.Links_;
import com.google.gson.Gson;

public class ShallowSearchController extends ProcessResponse {

  @Override
  public SampleResult runTest(JavaSamplerContext context) {

    SampleResult result = new SampleResult();
    result.sampleStart(); // start stopwatch

    /*
     * String rest =
     * JMeterContextService.getContext().getPreviousResult().getResponseDataAsString();
     * 
     * JSONObject jobj; JSONObject resorts = null; try { jobj = new JSONObject(rest); resorts =
     * jobj.getJSONObject("resorts"); } catch (JSONException e) { // TODO Auto-generated catch block
     * e.printStackTrace(); }
     * 
     * String[] resortsNames = JSONObject.getNames(resorts);
     * 
     * StringBuffer resortList = new StringBuffer("Resort list:\n"); for (int i = 0; i <
     * resortsNames.length; i++) { resortList.append(resortsNames[i] + "\n"); }
     * 
     * if (resortsNames.length == 0) { result.sampleEnd(); // stop stopwatch
     * result.setSuccessful(false);
     * result.setResponseMessage("No resorts on shallow search worning"); //
     * result.setResponseCodeOK(); // 200 code result.setResponseCode("Fail"); } else {
     * 
     * result.sampleEnd(); // stop stopwatch result.setSuccessful(true);
     * result.setResponseMessage(resortList.toString()); result.setResponseCodeOK(); // 200 code
     * 
     * }
     */

    Affiliation obj = new Affiliation();
    obj.setId("una id peter");
    obj.setLinks(new Links_());
    Gson gson = new Gson();
    String jsonInString = gson.toJson(obj);


    JSONObject.quote("");
    result.sampleEnd(); // stop stopwatch
    result.setSuccessful(true);
    result.setResponseData(jsonInString);
    result.setResponseMessage("funca again");
    result.setResponseCodeOK(); // 200 code

    return result;

  }

}
