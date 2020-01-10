
package com.globant.jmeter.tester.pojos.shallow;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.annotation.Generated;

@Generated("org.jsonschema2pojo")
public class ResortPackage_________________ {

    private Links________________________________________________________ links;
    private String id;
    private List<Component_________________> components = new ArrayList<Component_________________>();
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * 
     * @return
     *     The links
     */
    public Links________________________________________________________ getLinks() {
        return links;
    }

    /**
     * 
     * @param links
     *     The links
     */
    public void setLinks(Links________________________________________________________ links) {
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
    public List<Component_________________> getComponents() {
        return components;
    }

    /**
     * 
     * @param components
     *     The components
     */
    public void setComponents(List<Component_________________> components) {
        this.components = components;
    }

    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
