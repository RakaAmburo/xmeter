
package com.globant.jmeter.tester.pojos.add2cart;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.annotation.Generated;

@Generated("org.jsonschema2pojo")
public class RemoveAction {

    private Boolean enabled;
    private List<Object> componentsToRemove = new ArrayList<Object>();
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
     *     The componentsToRemove
     */
    public List<Object> getComponentsToRemove() {
        return componentsToRemove;
    }

    /**
     * 
     * @param componentsToRemove
     *     The componentsToRemove
     */
    public void setComponentsToRemove(List<Object> componentsToRemove) {
        this.componentsToRemove = componentsToRemove;
    }

    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
