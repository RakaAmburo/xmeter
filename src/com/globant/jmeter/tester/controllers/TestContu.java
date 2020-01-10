package com.globant.jmeter.tester.controllers;

import org.apache.jmeter.protocol.java.sampler.JavaSamplerContext;
import org.apache.jmeter.samplers.SampleResult;
import org.json.JSONObject;

public class TestContu extends ProcessResponse {

  public SampleResult runTest(JavaSamplerContext context) {

      SampleResult result = new SampleResult();
      result.sampleStart(); // start stopwatch
      
      JSONObject.quote("");
      result.sampleEnd(); // stop stopwatch
      result.setSuccessful(true);
      result.setResponseData("pepe", "mujica");
      result.setResponseMessage("funca again");
      result.setResponseCodeOK(); // 200 code

      return result;
  }

}
