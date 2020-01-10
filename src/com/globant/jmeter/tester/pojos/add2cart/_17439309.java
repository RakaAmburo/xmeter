
package com.globant.jmeter.tester.pojos.add2cart;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.annotation.Generated;

@Generated("org.jsonschema2pojo")
public class _17439309 {

    private String id;
    private String name;
    private String group;
    private String subgroup;
    private List<Description> descriptions = new ArrayList<Description>();
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

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
     *     The name
     */
    public String getName() {
        return name;
    }

    /**
     * 
     * @param name
     *     The name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 
     * @return
     *     The group
     */
    public String getGroup() {
        return group;
    }

    /**
     * 
     * @param group
     *     The group
     */
    public void setGroup(String group) {
        this.group = group;
    }

    /**
     * 
     * @return
     *     The subgroup
     */
    public String getSubgroup() {
        return subgroup;
    }

    /**
     * 
     * @param subgroup
     *     The subgroup
     */
    public void setSubgroup(String subgroup) {
        this.subgroup = subgroup;
    }

    /**
     * 
     * @return
     *     The descriptions
     */
    public List<Description> getDescriptions() {
        return descriptions;
    }

    /**
     * 
     * @param descriptions
     *     The descriptions
     */
    public void setDescriptions(List<Description> descriptions) {
        this.descriptions = descriptions;
    }

    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
