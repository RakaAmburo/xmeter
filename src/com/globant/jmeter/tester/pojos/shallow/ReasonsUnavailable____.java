
package com.globant.jmeter.tester.pojos.shallow;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.Generated;

@Generated("org.jsonschema2pojo")
public class ReasonsUnavailable____ {

    private String reasonCode;
    private ResortPackage____ resortPackage;
    private Resort____ resort;
    private RoomType____ roomType;
    private String rateType;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * 
     * @return
     *     The reasonCode
     */
    public String getReasonCode() {
        return reasonCode;
    }

    /**
     * 
     * @param reasonCode
     *     The reasonCode
     */
    public void setReasonCode(String reasonCode) {
        this.reasonCode = reasonCode;
    }

    /**
     * 
     * @return
     *     The resortPackage
     */
    public ResortPackage____ getResortPackage() {
        return resortPackage;
    }

    /**
     * 
     * @param resortPackage
     *     The resortPackage
     */
    public void setResortPackage(ResortPackage____ resortPackage) {
        this.resortPackage = resortPackage;
    }

    /**
     * 
     * @return
     *     The resort
     */
    public Resort____ getResort() {
        return resort;
    }

    /**
     * 
     * @param resort
     *     The resort
     */
    public void setResort(Resort____ resort) {
        this.resort = resort;
    }

    /**
     * 
     * @return
     *     The roomType
     */
    public RoomType____ getRoomType() {
        return roomType;
    }

    /**
     * 
     * @param roomType
     *     The roomType
     */
    public void setRoomType(RoomType____ roomType) {
        this.roomType = roomType;
    }

    /**
     * 
     * @return
     *     The rateType
     */
    public String getRateType() {
        return rateType;
    }

    /**
     * 
     * @param rateType
     *     The rateType
     */
    public void setRateType(String rateType) {
        this.rateType = rateType;
    }

    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
