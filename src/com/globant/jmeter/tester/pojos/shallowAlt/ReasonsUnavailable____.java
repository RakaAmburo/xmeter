
package com.globant.jmeter.tester.pojos.shallowAlt;

import java.util.HashMap;
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
    "reasonCode",
    "resortPackage",
    "resort",
    "roomType",
    "rateType"
})
public class ReasonsUnavailable____ {

    @JsonProperty("reasonCode")
    private String reasonCode;
    @JsonProperty("resortPackage")
    private ResortPackage____ resortPackage;
    @JsonProperty("resort")
    private Resort____ resort;
    @JsonProperty("roomType")
    private RoomType____ roomType;
    @JsonProperty("rateType")
    private String rateType;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * 
     * @return
     *     The reasonCode
     */
    @JsonProperty("reasonCode")
    public String getReasonCode() {
        return reasonCode;
    }

    /**
     * 
     * @param reasonCode
     *     The reasonCode
     */
    @JsonProperty("reasonCode")
    public void setReasonCode(String reasonCode) {
        this.reasonCode = reasonCode;
    }

    /**
     * 
     * @return
     *     The resortPackage
     */
    @JsonProperty("resortPackage")
    public ResortPackage____ getResortPackage() {
        return resortPackage;
    }

    /**
     * 
     * @param resortPackage
     *     The resortPackage
     */
    @JsonProperty("resortPackage")
    public void setResortPackage(ResortPackage____ resortPackage) {
        this.resortPackage = resortPackage;
    }

    /**
     * 
     * @return
     *     The resort
     */
    @JsonProperty("resort")
    public Resort____ getResort() {
        return resort;
    }

    /**
     * 
     * @param resort
     *     The resort
     */
    @JsonProperty("resort")
    public void setResort(Resort____ resort) {
        this.resort = resort;
    }

    /**
     * 
     * @return
     *     The roomType
     */
    @JsonProperty("roomType")
    public RoomType____ getRoomType() {
        return roomType;
    }

    /**
     * 
     * @param roomType
     *     The roomType
     */
    @JsonProperty("roomType")
    public void setRoomType(RoomType____ roomType) {
        this.roomType = roomType;
    }

    /**
     * 
     * @return
     *     The rateType
     */
    @JsonProperty("rateType")
    public String getRateType() {
        return rateType;
    }

    /**
     * 
     * @param rateType
     *     The rateType
     */
    @JsonProperty("rateType")
    public void setRateType(String rateType) {
        this.rateType = rateType;
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
