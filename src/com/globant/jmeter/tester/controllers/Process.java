package com.globant.jmeter.tester.controllers;

import org.apache.jmeter.protocol.java.sampler.JavaSamplerContext;
import org.apache.jmeter.samplers.SampleResult;

public interface Process {
    
    public SampleResult runTest(JavaSamplerContext context);

}
