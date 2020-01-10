package com.globant.jmeter.tester.controllers;

import java.util.HashMap;
import java.util.Map;
import org.apache.jmeter.protocol.java.sampler.JavaSamplerContext;
import org.apache.jmeter.samplers.SampleResult;
import org.apache.jmeter.threads.JMeterContextService;
import helper.hotLoader.rf.HotLoader;

/**
 * Component in charge of selecting witch controller will be executed
 * 
 * @author pablo
 *
 */
public class TopController implements Controller{
  
    private Map<String, Class<?>>  getControllerList() {
      
      Map<String, Class<?>> controllerList = new HashMap<String, Class<?>>();
      
      controllerList.put("offers", OfferDetailsController.class);
      controllerList.put("shallow", ShallowSearchController.class);
      controllerList.put("pragsis", TestController.class);
      controllerList.put("AddToCart", AddToCartController.class);
      controllerList.put("topi", TestContu.class);
      controllerList.put("peter", PeterController.class);
      
      return controllerList;
    }
    
	@Override
	public SampleResult runTest(JavaSamplerContext context) {

		Controller controller = null;

		
		/* This will be provided by the context */
		//String controllerFromContext = "offersDescription";
		String controllerFromContext = JMeterContextService.getContext().getCurrentSampler().getComment().trim();
		
		Map<String, Class<?>> controllerList = getControllerList();
		Class<?> clazz = controllerList.get(controllerFromContext);
		if (clazz == null) {
		  throw new IllegalArgumentException("Invalid controller: "
              + controllerFromContext);
		}
		controller = (Controller) HotLoader.load(clazz);

		SampleResult result = null;

		result = controller.runTest(context);

		return result;
	}

}
