package com.globant.jmeter.tester.controllers;

import java.io.IOException;

import helper.hotLoader.rf.HotLoader;
import helper.jarLoader.Loader;
import helper.propertiesLoader.PropertiesLoader;

import org.apache.jmeter.protocol.java.sampler.AbstractJavaSamplerClient;
import org.apache.jmeter.protocol.java.sampler.JavaSamplerContext;
import org.apache.jmeter.samplers.SampleResult;

/**
 * First step and only class visible for jmeter. And represent the javeRequest element.
 * This component will re-load dynamically  the driver that will chose witch controller
 * to activate. In production environment the classes will be instantiated normally. 
 * 
 * @author pablo
 *
 */
public class JavaRequest extends AbstractJavaSamplerClient {

    @Override
    public SampleResult runTest(JavaSamplerContext context) {
    	
    	String projectFolder = PropertiesLoader.getProperty("projectPath");
    	System.out.println(projectFolder);
    	/* Loading all the jars into the vm */
    	try {
			Loader.Cargar(projectFolder + "/lib");
		} catch (IOException e) {
			e.printStackTrace();
		}

    	Controller controller = (Controller) HotLoader.load(TopController.class);

        SampleResult result = null;
        
        result = controller.runTest(context);
        
        

        return result;
    }

}
