
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
    "links",
    "availabilityId",
    "expirationDatetime",
    "messageIds",
    "resorts"
})
public class Shallow {

    @JsonProperty("links")
    private Links links;
    @JsonProperty("availabilityId")
    private String availabilityId;
    @JsonProperty("expirationDatetime")
    private String expirationDatetime;
    @JsonProperty("messageIds")
    private List<String> messageIds = new ArrayList<String>();
    @JsonProperty("resorts")
    private Resorts resorts;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * 
     * @return
     *     The links
     */
    @JsonProperty("links")
    public Links getLinks() {
        return links;
    }

    /**
     * 
     * @param links
     *     The links
     */
    @JsonProperty("links")
    public void setLinks(Links links) {
        this.links = links;
    }

    /**
     * 
     * @return
     *     The availabilityId
     */
    @JsonProperty("availabilityId")
    public String getAvailabilityId() {
        return availabilityId;
    }

    /**
     * 
     * @param availabilityId
     *     The availabilityId
     */
    @JsonProperty("availabilityId")
    public void setAvailabilityId(String availabilityId) {
        this.availabilityId = availabilityId;
    }

    /**
     * 
     * @return
     *     The expirationDatetime
     */
    @JsonProperty("expirationDatetime")
    public String getExpirationDatetime() {
        return expirationDatetime;
    }

    /**
     * 
     * @param expirationDatetime
     *     The expirationDatetime
     */
    @JsonProperty("expirationDatetime")
    public void setExpirationDatetime(String expirationDatetime) {
        this.expirationDatetime = expirationDatetime;
    }

    /**
     * 
     * @return
     *     The messageIds
     */
    @JsonProperty("messageIds")
    public List<String> getMessageIds() {
        return messageIds;
    }

    /**
     * 
     * @param messageIds
     *     The messageIds
     */
    @JsonProperty("messageIds")
    public void setMessageIds(List<String> messageIds) {
        this.messageIds = messageIds;
    }

    /**
     * 
     * @return
     *     The resorts
     */
    @JsonProperty("resorts")
    public Resorts getResorts() {
        return resorts;
    }

    /**
     * 
     * @param resorts
     *     The resorts
     */
    @JsonProperty("resorts")
    public void setResorts(Resorts resorts) {
        this.resorts = resorts;
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
