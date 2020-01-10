
package com.globant.jmeter.tester.pojos.add2cart;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.annotation.Generated;

@Generated("org.jsonschema2pojo")
public class Flight {

    private AddAction___ addAction;
    private List<SupportedComponent_____> supportedComponents = new ArrayList<SupportedComponent_____>();
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * 
     * @return
     *     The addAction
     */
    public AddAction___ getAddAction() {
        return addAction;
    }

    /**
     * 
     * @param addAction
     *     The addAction
     */
    public void setAddAction(AddAction___ addAction) {
        this.addAction = addAction;
    }

    /**
     * 
     * @return
     *     The supportedComponents
     */
    public List<SupportedComponent_____> getSupportedComponents() {
        return supportedComponents;
    }

    /**
     * 
     * @param supportedComponents
     *     The supportedComponents
     */
    public void setSupportedComponents(List<SupportedComponent_____> supportedComponents) {
        this.supportedComponents = supportedComponents;
    }

    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
