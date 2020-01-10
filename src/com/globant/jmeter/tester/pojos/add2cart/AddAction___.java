
package com.globant.jmeter.tester.pojos.add2cart;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.annotation.Generated;

@Generated("org.jsonschema2pojo")
public class AddAction___ {

    private Boolean enabled;
    private List<String> disabledReasons = new ArrayList<String>();
    private List<MissingCategory__> missingCategories = new ArrayList<MissingCategory__>();
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
     *     The disabledReasons
     */
    public List<String> getDisabledReasons() {
        return disabledReasons;
    }

    /**
     * 
     * @param disabledReasons
     *     The disabledReasons
     */
    public void setDisabledReasons(List<String> disabledReasons) {
        this.disabledReasons = disabledReasons;
    }

    /**
     * 
     * @return
     *     The missingCategories
     */
    public List<MissingCategory__> getMissingCategories() {
        return missingCategories;
    }

    /**
     * 
     * @param missingCategories
     *     The missingCategories
     */
    public void setMissingCategories(List<MissingCategory__> missingCategories) {
        this.missingCategories = missingCategories;
    }

    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
