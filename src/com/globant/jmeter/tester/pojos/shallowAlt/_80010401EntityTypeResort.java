
package com.globant.jmeter.tester.pojos.shallowAlt;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("org.jsonschema2pojo")
@JsonPropertyOrder({
    "reasonsUnavailable"
})
public class _80010401EntityTypeResort {

    @JsonProperty("reasonsUnavailable")
    private List<ReasonsUnavailable_______________> reasonsUnavailable = new ArrayList<ReasonsUnavailable_______________>();
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * 
     * @return
     *     The reasonsUnavailable
     */
    @JsonProperty("reasonsUnavailable")
    public List<ReasonsUnavailable_______________> getReasonsUnavailable() {
        return reasonsUnavailable;
    }

    /**
     * 
     * @param reasonsUnavailable
     *     The reasonsUnavailable
     */
    @JsonProperty("reasonsUnavailable")
    public void setReasonsUnavailable(List<ReasonsUnavailable_______________> reasonsUnavailable) {
        this.reasonsUnavailable = reasonsUnavailable;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
