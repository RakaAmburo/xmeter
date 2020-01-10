
package com.globant.jmeter.tester.pojos.shallow;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.annotation.Generated;

@Generated("org.jsonschema2pojo")
public class ShallowSearchInfo {

    private Links links;
    private String availabilityId;
    private String expirationDatetime;
    private List<String> messageIds = new ArrayList<String>();
    private Resorts resorts;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * 
     * @return
     *     The links
     */
    public Links getLinks() {
        return links;
    }

    /**
     * 
     * @param links
     *     The links
     */
    public void setLinks(Links links) {
        this.links = links;
    }

    /**
     * 
     * @return
     *     The availabilityId
     */
    public String getAvailabilityId() {
        return availabilityId;
    }

    /**
     * 
     * @param availabilityId
     *     The availabilityId
     */
    public void setAvailabilityId(String availabilityId) {
        this.availabilityId = availabilityId;
    }

    /**
     * 
     * @return
     *     The expirationDatetime
     */
    public String getExpirationDatetime() {
        return expirationDatetime;
    }

    /**
     * 
     * @param expirationDatetime
     *     The expirationDatetime
     */
    public void setExpirationDatetime(String expirationDatetime) {
        this.expirationDatetime = expirationDatetime;
    }

    /**
     * 
     * @return
     *     The messageIds
     */
    public List<String> getMessageIds() {
        return messageIds;
    }

    /**
     * 
     * @param messageIds
     *     The messageIds
     */
    public void setMessageIds(List<String> messageIds) {
        this.messageIds = messageIds;
    }

    /**
     * 
     * @return
     *     The resorts
     */
    public Resorts getResorts() {
        return resorts;
    }

    /**
     * 
     * @param resorts
     *     The resorts
     */
    public void setResorts(Resorts resorts) {
        this.resorts = resorts;
    }

    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
