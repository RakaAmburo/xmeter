
package com.globant.jmeter.tester.pojos.shallow;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.annotation.Generated;

@Generated("org.jsonschema2pojo")
public class _80010393EntityTypeResort {

    private List<ReasonsUnavailable_> reasonsUnavailable = new ArrayList<ReasonsUnavailable_>();
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * 
     * @return
     *     The reasonsUnavailable
     */
    public List<ReasonsUnavailable_> getReasonsUnavailable() {
        return reasonsUnavailable;
    }

    /**
     * 
     * @param reasonsUnavailable
     *     The reasonsUnavailable
     */
    public void setReasonsUnavailable(List<ReasonsUnavailable_> reasonsUnavailable) {
        this.reasonsUnavailable = reasonsUnavailable;
    }

    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
