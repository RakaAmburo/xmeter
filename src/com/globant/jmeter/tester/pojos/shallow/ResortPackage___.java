
package com.globant.jmeter.tester.pojos.shallow;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.annotation.Generated;

@Generated("org.jsonschema2pojo")
public class ResortPackage___ {

    private Links__________ links;
    private String id;
    private List<Component___> components = new ArrayList<Component___>();
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * 
     * @return
     *     The links
     */
    public Links__________ getLinks() {
        return links;
    }

    /**
     * 
     * @param links
     *     The links
     */
    public void setLinks(Links__________ links) {
        this.links = links;
    }

    /**
     * 
     * @return
     *     The id
     */
    public String getId() {
        return id;
    }

    /**
     * 
     * @param id
     *     The id
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * 
     * @return
     *     The components
     */
    public List<Component___> getComponents() {
        return components;
    }

    /**
     * 
     * @param components
     *     The components
     */
    public void setComponents(List<Component___> components) {
        this.components = components;
    }

    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
