
package com.globant.jmeter.tester.pojos.add2cart;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.annotation.Generated;

@Generated("org.jsonschema2pojo")
public class PartyMix {

    private Integer adultCount;
    private Integer childCount;
    private List<Object> nonAdultAges = new ArrayList<Object>();
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * 
     * @return
     *     The adultCount
     */
    public Integer getAdultCount() {
        return adultCount;
    }

    /**
     * 
     * @param adultCount
     *     The adultCount
     */
    public void setAdultCount(Integer adultCount) {
        this.adultCount = adultCount;
    }

    /**
     * 
     * @return
     *     The childCount
     */
    public Integer getChildCount() {
        return childCount;
    }

    /**
     * 
     * @param childCount
     *     The childCount
     */
    public void setChildCount(Integer childCount) {
        this.childCount = childCount;
    }

    /**
     * 
     * @return
     *     The nonAdultAges
     */
    public List<Object> getNonAdultAges() {
        return nonAdultAges;
    }

    /**
     * 
     * @param nonAdultAges
     *     The nonAdultAges
     */
    public void setNonAdultAges(List<Object> nonAdultAges) {
        this.nonAdultAges = nonAdultAges;
    }

    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
