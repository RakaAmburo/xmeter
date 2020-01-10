
package com.globant.jmeter.tester.pojos.add2cart;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.annotation.Generated;

@Generated("org.jsonschema2pojo")
public class AddAction {

    private Boolean enabled;
    private List<AddableComponent> addableComponents = new ArrayList<AddableComponent>();
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * 
     * @return
     *     The enabled
     */
    public Boolean getEnabled() {
        return enabled;
    }

    /**
     * 
     * @param enabled
     *     The enabled
     */
    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }

    /**
     * 
     * @return
     *     The addableComponents
     */
    public List<AddableComponent> getAddableComponents() {
        return addableComponents;
    }

    /**
     * 
     * @param addableComponents
     *     The addableComponents
     */
    public void setAddableComponents(List<AddableComponent> addableComponents) {
        this.addableComponents = addableComponents;
    }

    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
